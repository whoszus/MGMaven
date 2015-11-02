[10 28]:
    今天写hql出现重大问题,结果出不来,调试的方法是?
1.hello.今天开始写后台项目
2.项目的原始架构是@author phn
--20151027


[10.29]
    1.hibernate  org.hibernate.AnnotationException: No identifier specified for entity
            -- entity 添加 @Id注解

    2.org.hibernate.HibernateException: No Session found for current thread
            a.  <aop:pointcut id="transactionPointcut" expression="execution(* com.*.service..*Impl.*(..))" />
            事务路径不正确;没有扫描到..
            b. Spring切入点表达式常用写法;
            c.stackoverflow: 可能是声明事务的service method 已 protected修饰; 权限问题?
                I'll just add something that took me some time to debug : don't forget that a @Transactional annotation will only work on "public" methods.
                I put some @Transactional on "protected" ones and got this error. 
            d.stackoverflow:
                <tx:annotation-driven/>
                <bean id="transactionManager"
                 class="org.springframework.orm.hibernate4.HibernateTransactionManager">
                <property name="sessionFactory" ref="sessionFactory"></property>
                </bean>


    3. Table 'enrollbackend.classcatcher' doesn't exist
        a. hibernate 配置了自动创建表 ,但是没有创建成功;   <prop key="hibernate.hbm2ddl.auto">update</prop>
        b. 原因可能为?


    4.The database returned no natively generated identity value
        a.@GeneratedValue(strategy = GenerationType.IDENTITY) 本地生成策略
        
        

    [11.02]
    1.今天继续出现HibernateException: No Session found for current thread ??什么原因!!!
        问题排查过程:
        a.spring 配置一下信息之后还是不行;
            <aop:aspectj-autoproxy proxy-target-class="true" />
        b.分析可能还是切点路径的问题  
            写测试类,后发现还是...
        c.Hibernate4 和Spring整合的时候这个过滤器好像很重要： http://docs.spring.io/spring/docs/4.0.3.RELEASE/javadoc-api//org/springframework/orm/hibernate4/support/OpenSessionInViewFilter.html
            可能是这个过滤器的问题: 在web.xml中添加:
            !!!此方法是对的,在web.xml中缺少这个filter的mapping 
            
          ps: 关于OpenSessionInViewFilter的介绍 : 
          Servlet 2.3 Filter that binds a Hibernate Session to the thread for the entire processing of the request. Intended for the "Open Session in View" pattern, i.e. to allow for lazy loading in web views despite the original transactions already being completed.
          This filter makes Hibernate Sessions available via the current thread, which will be autodetected by transaction managers. It is suitable for service layer transactions via HibernateTransactionManager as well as for non-transactional execution (if configured appropriately).
            
    2.but was actually of type [com.sun.proxy.$Proxy37]  
        Controller 里面应该Autowired 的是接口 ,多态 ,降低耦合 ;
        IFirstService
        
        
    3. Unknown entity: whoszus.model.firstModel.entity.ClassCather
        a.排除导包问题;
        b.找到问题 : 配置文件中没有扫描到映射  spring-hibernate.xml 中;
    4.could not execute statement] with root cause
      java.sql.SQLException: Field 'uuid' doesn't have a default value
      
      
        