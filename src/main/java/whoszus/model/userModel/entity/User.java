package whoszus.model.userModel.entity;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by Administrator on 2015/11/3.
 * ”√ªß;
 */
@Entity
@Table(name = "mguser")
public class User implements Serializable {
    private Integer id;
    private String nick;
    private String qq;
    private String webChat;
    private int role;
    private int classId;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @Column(name= "nick")
    public String getNick() {
        return nick;
    }
    @Column(name="qq")
    public String getQq() {
        return qq;
    }

    @Column(name="webChat")
    public String getWebChat() {
        return webChat;
    }

    @Column(name="role")
    public int getRole() {
        return role;
    }

    @Column(name="classId")
    public int getClassId() {
        return classId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setWebChat(String webChat) {
        this.webChat = webChat;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
