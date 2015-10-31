package whoszus.model.firstModel.dao.impl;

import org.springframework.stereotype.Repository;
import whoszus.model.firstModel.dao.IFirstDao;
import whoszus.model.firstModel.entity.ClassCather;

import java.util.List;

/**
 * Created by linyanying on 2015/10/31.
 */
@Repository("firstDao")
public class FirstDaoImpl  implements IFirstDao{
    @Override
    public void save(ClassCather classCather) {

    }

    @Override
    public ClassCather getClassCatcher(ClassCather classCather) {
        return null;
    }

    @Override
    public List<ClassCather> getAllCc() {
        return null;
    }
}
