package whoszus.model.blogModel.entity;

import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import javax.persistence.*;

/**
 * Created by Administrator on 2015/11/3.
 * ��������
 */
@Entity
@Table(name = "CommentBlog")
public class CommentBlog {
    private String uuid; //����
    private String messageId;    //����id
    private int uid;    //�û�
    private int blogId;    //����id
    private String detail;  //����
    private Date date;  //����ʱ��

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
