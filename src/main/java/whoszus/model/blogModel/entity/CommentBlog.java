package whoszus.model.blogModel.entity;

import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import javax.persistence.*;

/**
 * Created by Administrator on 2015/11/3.
 * 主题评论
 */
@Entity
@Table(name = "CommentBlog")
public class CommentBlog {
    private String uuid; //主键
    private String messageId;    //评论id
    private int uid;    //用户
    private int blogId;    //评论id
    private String detail;  //内容
    private Date date;  //评论时间

    @Id
    @GeneratedValue(generator = "paymentableGenerator")
    @GenericGenerator(name = "paymentableGenerator", strategy = "assigned")
    @Column(name="uuid" ,nullable = false ,length = 64)
    public String getUuid() {
        return uuid;
    }

    @Column(name = "blogId")
    public int getBlogId() {
        return blogId;
    }

    @Column(name = "detail")
    public String getDetail() {
        return detail;
    }

    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    @Column(name="uid")
    public int getUid() {
        return uid;
    }
}
