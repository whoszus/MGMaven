package whoszus.model.blogModel.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 */
public class Blog implements Serializable{
    private String uuid; //主键id
    private int uid;    //创建本主题的user id
    private int anonymous;  //是否匿名
    private Date date;  //创建时间
    private String detail;  //内容
    private String theme;   //主题名



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

    public String getTheme() {
        return theme;
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

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
