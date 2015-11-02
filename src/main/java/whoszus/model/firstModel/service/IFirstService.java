package whoszus.model.firstModel.service;

import whoszus.model.firstModel.entity.ClassCather;

import java.util.List;

/**
 * Created by linyanying on 2015/10/31.
 */
public interface IFirstService {
    public void save(ClassCather classCather);
    public ClassCather getClassCatcher(ClassCather classCather);
    public List<ClassCather> getAllCc();
}
