package whoszus.model.messageModel.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by linyanying on 2015/11/3.
 * ����POJO
 *
 */
@Entity
@Table(name = "mg_userLogin")
public class Message implements Serializable{
    private String uuid; //����
    private Date date;  //����ʱ��
    private String detail;  //��������
    private int uid;    //userid
    private int anonymous; //����

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
