@Repository��@Service��@Controller �� @Component �����ʶΪBean
Spring �� 2.0 �汾��ʼ��½��������һЩע�����ڼ� Spring �Ŀ�����@Repositoryע����������������һ���������ڽ����ݷ��ʲ� (DAO �� ) �����ʶΪ Spring Bean������ֻ�轫��ע���ע�� DAO���ϼ��ɡ�ͬʱ��Ϊ���� Spring �ܹ�ɨ����·���е��ಢʶ��� @Repository ע�⣬��Ҫ�� XML �����ļ�������Bean ���Զ�ɨ�蹦�ܣ������ͨ��<context:component-scan/>ʵ�֡�������ʾ��

 // ����ʹ�� @Repository �� DAO ������Ϊ Bean 
 package bookstore.dao; 
 @Repository 
 public class UserDaoImpl implements UserDao{ ���� } 

 // ��Σ��� XML �����ļ������� Spring ���Զ�ɨ�蹦��
 <beans �� > 
    ����
 <context:component-scan base-package=��bookstore.dao�� /> 
����
 </beans> 

��ˣ����ǾͲ�����Ҫ�� XML ����ʽʹ�� <bean/> ����Bean �����á�Spring ��������ʼ��ʱ���Զ�ɨ�� base-package ָ���İ������Ӱ��µ����� class�ļ������б�ע�� @Repository ���඼����ע��Ϊ Spring Bean��

Ϊʲô @Repository ֻ�ܱ�ע�� DAO �����أ�������Ϊ��ע������ò�ֻ�ǽ���ʶ��ΪBean��ͬʱ�����ܽ�����ע�������׳������ݷ����쳣��װΪ Spring �����ݷ����쳣���͡� Spring�����ṩ��һ���ḻ�Ĳ��������������ݷ��ʼ����޹ص����ݷ����쳣�ṹ�����ڷ�װ��ͬ�ĳ־ò����׳����쳣��ʹ���쳣�����ڵײ�Ŀ�ܡ�

Spring 2.5 �� @Repository�Ļ����������˹������ƵĶ�������ע�⣺@Component��@Service��@Constroller�����Ƿֱ��������ϵͳ�Ĳ�ͬ��Σ�

@Component ��һ�������ĸ��������ʾһ����� (Bean) �������������κβ�Ρ�
@Service ͨ��������ҵ��㣬����Ŀǰ�ù����� @Component ��ͬ��
@Constroller ͨ�������ڿ��Ʋ㣬����Ŀǰ�ù����� @Component ��ͬ��
ͨ��������ʹ�� @Repository��@Component��@Service �� @Constroller ע�⣬Spring���Զ�������Ӧ�� BeanDefinition ���󣬲�ע�ᵽ ApplicationContext �С���Щ��ͳ��� Spring�ܹ������������ע����������ڲ�ͬ�����ε��࣬��ʹ�÷�ʽ�� @Repository ����ȫ��ͬ�ġ�

���⣬����������ĸ�ע���⣬�û����Դ����Զ����ע�⣬Ȼ����ע���ϱ�ע @Component����ô�����Զ���ע������������@Component ��ͬ�Ĺ��ܡ�����������ܲ������á�

��һ�� Bean ���Զ���⵽ʱ��������Ǹ�ɨ������ BeanNameGenerator ������������ bean���ơ�Ĭ������£����ڰ��� name ���Ե� @Component��@Repository�� @Service ��@Controller����� name ȡֵ��Ϊ Bean �����֡�������ע�ⲻ���� nameֵ�����������Զ�����������ֵ������Ĭ�� Bean ���ƻ���Сд��ͷ�ķ��޶�����������㲻��ʹ��Ĭ�� bean�������ԣ������ṩһ���Զ�����������ԡ�����ʵ�� BeanNameGenerator�ӿڣ�ȷ�ϰ�����һ��Ĭ�ϵ��޲������췽����Ȼ��������ɨ����ʱ�ṩһ��ȫ�޶�������������ʾ��

 <beans ...> 
 <context:component-scan 
    base-package="a.b" name-generator="a.SimpleNameGenerator"/> 
 </beans> 

��ͨ�� XML ���õ� Spring Bean һ����ͨ������ע���ʶ��Bean����Ĭ����������"singleton"��Ϊ��������ĸ�ע�⣬�ڱ�ע Bean ��ͬʱ�ܹ�ָ�� Bean ��������Spring2.5 ������ @Scope ע�⡣ʹ�ø�ע��ʱֻ���ṩ����������ƾ����ˣ�������ʾ��

 @Scope("prototype") 
 @Repository 
 public class Demo { �� } 

��������ṩһ���Զ����������������Զ���ʹ�û���ע��ķ�����ֻ��ʵ�� ScopeMetadataResolver�ӿڣ�ȷ�ϰ���һ��Ĭ�ϵ�û�в����Ĺ��췽����Ȼ��������ɨ����ʱ�ṩȫ�޶�������

 <context:component-scan base-package="a.b"
 scope-resolver="footmark.SimpleScopeResolver" />


 ---http://blog.csdn.net/ye1992/article/details/19971467f