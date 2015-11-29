package whoszus.model.messageModel.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by linyanying on 2015/11/3.
 * 留言POJO
 *
 */
@Entity
@Table(name = "mg_userLogin")
public class Message implements Serializable{
    private String uuid; //主键
    private Date date;  //创建时间
    private String detail;  //评论内容
    private int uid;    //userid
    private int anonymous; //匿名

    @Id
    @GeneratedValue(generator = "paymentableGenerator")
    @GenericGenerator(name = "paymentableGenerator", strategy = "assigned")
    @Column(name="uuid" ,nullable = false ,length = 64)
    public String getUuid() {
        return uuid;
    }

    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    @Column(name = "detail")
    public String getDetail() {
        return detail;
    }

    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    @Column(name = "anonymous")
    public int getAnonymous() {
        return anonymous;
    }
}
