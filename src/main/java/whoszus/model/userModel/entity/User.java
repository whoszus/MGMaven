package whoszus.model.userModel.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Administrator on 2015/11/3.
 */
@Entity
@Table(name = "User")
public class User implements Serializable {
    private Integer id;
    private String nick;
    private String qq;
    private String webChat;
    private int role;
    private int classId;

    public String getNick() {
        return nick;
    }

    public Integer getId() {
        return id;
    }

    public String getQq() {
        return qq;
    }

    public String getWebChat() {
        return webChat;
    }

    public int getRole() {
        return role;
    }

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
