package whoszus.model.blogModel.entity;

import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 */
public class CommentBlog {
    private String uuid; //����
    private String messageId;    //����id
    private int uid;    //�û�
    private String detail;  //����
    private Date date;  //����ʱ��

    public String getUuid() {
        return uuid;
    }

    public String getMessageId() {
        return messageId;
    }

    public int getUid() {
        return uid;
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

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
