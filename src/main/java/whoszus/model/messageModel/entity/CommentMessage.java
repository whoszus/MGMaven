package whoszus.model.messageModel.entity;

import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 */
public class CommentMessage {
    private String uuid; //主键
    private int uid;    //用户
    private String themeId;    //主题id
    private String detail;  //内容
    private Date date;  //评论时间

    public String getUuid() {
        return uuid;
    }

    public int getUid() {
        return uid;
    }

    public String getThemeId() {
        return themeId;
    }

    public String getDetail() {
        return detail;
    }

    public Date getDate() {
        return date;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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
}
