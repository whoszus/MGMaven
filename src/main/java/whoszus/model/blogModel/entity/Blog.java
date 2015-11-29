package whoszus.model.blogModel.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Created by Administrator on 2015/11/3.
 * ������
 *
 */
@Entity
@Table(name = "blog")
public class Blog implements Serializable{
    private int uuid; //����id
    private int uid;    //�����������user id
    private int anonymous;  //�Ƿ�����
    private Date date;  //����ʱ��
    private String detail;  //����
    private String theme;   //������




    @Id
    @Column(name = "uuid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getUuid() {
        return uuid;
    }

    @Column(name="date")
    public Date getDate() {
        return date;
    }

    @Column(name = "detail")
    public String getDetail() {
        return detail;
    }

    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    @Column(name="anonymous")
    public int getAnonymous() {
        return anonymous;
    }

    @Column(name="theme")
    public String getTheme() {
        return theme;
    }
}
