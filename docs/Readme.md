[10 28]:
    ����дhql�����ش�����,���������,���Եķ�����?
1.hello.���쿪ʼд��̨��Ŀ
2.��Ŀ��ԭʼ�ܹ���@author phn
--20151027


[10.29]
    1.hibernate  org.hibernate.AnnotationException: No identifier specified for entity
            -- entity ��� @Idע��

    2.org.hibernate.HibernateException: No Session found for current thread
            a.  <aop:pointcut id="transactionPointcut" expression="execution(* com.*.service..*Impl.*(..))" />
            ����·������ȷ;û��ɨ�赽..
            b. Spring�������ʽ����д��;
            c.stackoverflow: ���������������service method �� protected����; Ȩ������?
                I'll just add something that took me some time to debug : don't forget that a @Transactional annotation will only work on "public" methods.
                I put some @Transactional on "protected" ones and got this error. 
            d.stackoverflow:
                <tx:annotation-driven/>
                <bean id="transactionManager"
                 class="org.springframework.orm.hibernate4.HibernateTransactionManager">
                <property name="sessionFactory" ref="sessionFactory"></property>
                </bean>


    3. Table 'enrollbackend.classcatcher' doesn't exist
        a. hibernate �������Զ������� ,����û�д����ɹ�;   <prop key="hibernate.hbm2ddl.auto">update</prop>
        b. ԭ�����Ϊ?


    4.The database returned no natively generated identity value
        a.@GeneratedValue(strategy = GenerationType.IDENTITY) �������ɲ���
        
        

    [11.02]
    1.�����������HibernateException: No Session found for current thread ??ʲôԭ��!!!
        �����Ų����:
        a.spring ����һ����Ϣ֮���ǲ���;
            <aop:aspectj-autoproxy proxy-target-class="true" />
        b.�������ܻ����е�·��������  
            д������,���ֻ���...
        c.Hibernate4 ��Spring���ϵ�ʱ������������������Ҫ�� http://docs.spring.io/spring/docs/4.0.3.RELEASE/javadoc-api//org/springframework/orm/hibernate4/support/OpenSessionInViewFilter.html
            ���������������������: ��web.xml�����:
            !!!�˷����ǶԵ�,��web.xml��ȱ�����filter��mapping 
            
          ps: ����OpenSessionInViewFilter�Ľ��� : 
          Servlet 2.3 Filter that binds a Hibernate Session to the thread for the entire processing of the request. Intended for the "Open Session in View" pattern, i.e. to allow for lazy loading in web views despite the original transactions already being completed.
          This filter makes Hibernate Sessions available via the current thread, which will be autodetected by transaction managers. It is suitable for service layer transactions via HibernateTransactionManager as well as for non-transactional execution (if configured appropriately).
            
    2.but was actually of type [com.sun.proxy.$Proxy37]  
        Controller ����Ӧ��Autowired ���ǽӿ� ,��̬ ,������� ;
        IFirstService
        
        
    3. Unknown entity: whoszus.model.firstModel.entity.ClassCather
        a.�ų���������;
        b.�ҵ����� : �����ļ���û��ɨ�赽ӳ��  spring-hibernate.xml ��;
    4.could not execute statement] with root cause
      java.sql.SQLException: Field 'uuid' doesn't have a default value
      
      @GeneratedValue(generator = "paymentableGenerator")
          @GenericGenerator(name = "paymentableGenerator", strategy = "assigned")
          
          �޸ĺ���ֲ������ݿ���û����,������û�ɹ�;
          
    5.  ���� :
        a.session��Ҫclose();??
        b.������������ķ�ʽ,��һ�ֱ�ע����,���ݿ����û�гɹ�;
        	<!-- ע�ⷽʽ�������� -->
        	 <tx:annotation-driven transaction-manager="transactionManager" />
        
        	<!-- ��������ʽ�������� -->
        	<tx:advice id="transactionAdvice" transaction-manager="transactionManager">
        c.����ע�͵ڶ���:
        
        
    6.