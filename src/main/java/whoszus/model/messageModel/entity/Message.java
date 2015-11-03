package whoszus.model.messageModel.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 */
public class Message implements Serializable{
    private String uuid; //主键
    private Date date;  //创建时间
    private String detail;  //评论内容
    private int uid;
    private int anonymous;
}
