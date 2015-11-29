package whoszus.model.messageModel.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 * 留言评论POJO
 */
@Entity
@Table(name = "CommentMessage")
public class CommentMessage {
    private String uuid; //主键
    private String themeId;    //主题id
    private String detail;  //内容
    private Date date;  //评论时间
    private int uid;    //用户

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
