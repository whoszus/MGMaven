package whoszus.model.firstModel.service.impl;

import whoszus.model.firstModel.dao.IFirstDao;
import whoszus.model.firstModel.entity.ClassCather;
import whoszus.model.firstModel.service.IFirstServiceDao;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by linyanying on 2015/10/31.
 */
public class FirstService implements IFirstServiceDao {
    @Resource
    private IFirstDao firstDao;

    @Override
    public void save(ClassCather classCather) {
        firstDao.save(classCather);
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
