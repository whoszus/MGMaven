package whoszus.model.messageModel.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 */
public class Message implements Serializable{
    private String uuid; //����
    private int uid;    //userid
    private int anonymous; //����
    private Date date;  //����ʱ��
    private String detail;  //��������

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
