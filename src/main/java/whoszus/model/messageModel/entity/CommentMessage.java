package whoszus.model.messageModel.entity;

import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 */
public class CommentMessage {
    private String uuid; //����
    private int uid;    //�û�
    private String themeId;    //����id
    private String detail;  //����
    private Date date;  //����ʱ��

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
