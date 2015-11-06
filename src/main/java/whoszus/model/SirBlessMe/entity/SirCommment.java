package whoszus.model.SirBlessMe.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2015/11/6.
 */
public class SirCommment implements Serializable {
    private String uuid;
    private String sirId;
    private Date commentDate;
    private String comment;

    public String getUuid() {
        return uuid;
    }

    public String getSirId() {
        return sirId;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public String getComment() {
        return comment;
    }


    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setSirId(String sirId) {
        this.sirId = sirId;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
