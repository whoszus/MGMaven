package whoszus.model.messageModel.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 */
public class Message implements Serializable{
    private String uuid; //主键
    private int uid;    //userid
    private int anonymous; //匿名
    private Date date;  //创建时间
    private String detail;  //评论内容

    public String getUuid() {
        return uuid;
    }

    public int getUid() {
        return uid;
    }

    public int getAnonymous() {
        return anonymous;
    }

    public Date getDate() {
        return date;
    }

    public String getDetail() {
        return detail;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setAnonymous(int anonymous) {
        this.anonymous = anonymous;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
