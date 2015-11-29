package whoszus.model.messageModel.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 * ��������POJO
 */
@Entity
@Table(name = "CommentMessage")
public class CommentMessage {
    private String uuid; //����
    private String themeId;    //����id
    private String detail;  //����
    private Date date;  //����ʱ��
    private int uid;    //�û�

    @Id
    @GeneratedValue(generator = "paymentableGenerator")
    @GenericGenerator(name = "paymentableGenerator", strategy = "assigned")
    @Column(name="uuid" ,nullable = false ,length = 64)
    public String getUuid() {
        return uuid;
    }

    @Column(name = "themeId")
    public String getThemeId() {
        return themeId;
    }

    @Column(name = "detail")
    public String getDetail() {
        return detail;
    }

    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setThemeId(String themeId) {
        this.themeId = themeId;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
