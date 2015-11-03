package whoszus.model.blogModel.entity;

import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 */
public class CommentBlog {
    private String uuid; //主键
    private String messageId;    //评论id
    private String detail;  //内容
    private Date date;  //评论时间
    private int uid;    //用户
}
