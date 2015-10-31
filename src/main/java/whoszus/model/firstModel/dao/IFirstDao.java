package whoszus.model.firstModel.dao;

import whoszus.model.firstModel.entity.ClassCather;

import java.util.List;

/**
 * Created by linyanying on 2015/10/31.
 */
public interface IFirstDao {
    public void save(ClassCather classCather);
    public ClassCather getClassCatcher(ClassCather classCather);
    public List<ClassCather> getAllCc();
}
