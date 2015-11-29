package whoszus.model.firstModel.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import whoszus.model.firstModel.dao.IFirstDao;
import whoszus.model.firstModel.entity.ClassCather;

import javax.annotation.Resource;
import javax.management.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linyanying on 2015/10/31.
 */
@Repository("firstDao")
public class FirstDaoImpl  implements IFirstDao{


    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(ClassCather classCather) {

        Session session =this.getSession();
        session.save(classCather);
        System.out.println("save");
    }

    @Override
    public ClassCather getClassCatcher(ClassCather classCather) {
        Session session = this.getSession();
//        String hql = "from ClassCather where cc.uuid = ? ";
//        Query query = session.createQuery(hql);
        return null;
    }

    @Override
    public List<ClassCather> getAllCc() {
        List<ClassCather> list = new ArrayList<>();
        Session session = this.getSession();
//        Query query = session.createQuery("from ClassCather");
//        return ;
        return list;
    }
}
