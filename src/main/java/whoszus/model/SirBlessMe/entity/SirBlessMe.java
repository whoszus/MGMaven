package whoszus.model.SirBlessMe.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2015/11/6.
 */
public class SirBlessMe implements Serializable{
    private String uuid;
    private Date date ;
    private String detail;
    private Integer uid;
    private String commentId;

    public String getUuid() {
        return uuid;
    }

    public Date getDate() {
        return date;
    }

    public String getDetail() {
        return detail;
    }

    public Integer getUid() {
        return uid;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }
}
