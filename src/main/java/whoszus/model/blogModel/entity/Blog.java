package whoszus.model.blogModel.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 */
public class Blog implements Serializable{
    private String uuid; //主键id
    private Date date;  //创建时间
    private String detail;  //内容
    private int uid;    //创建本主题的user id
    private int anonymous;  //是否匿名
    private String theme;   //主题名
}
