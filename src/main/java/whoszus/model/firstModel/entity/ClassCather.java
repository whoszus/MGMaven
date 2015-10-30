package whoszus.model.firstModel.entity;

import javax.persistence.*;

/**
 * Created by linyanying on 2015/10/28.
 */

@Table(name = "t_classCatcher")
@Entity
public class ClassCather {
    private String name;
    private String tel;
    private String uuid;
    private String cls;
    private String password;
    private String nick;

    @Column(name = "name",nullable = false ,length = 30 )
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "tel",length = 11)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name="uuid" ,nullable = false ,length = 64)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Column(name="cls"  ,length = 30)
    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    @Column(name="password" ,nullable = false ,length = 64)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column(name="nick" ,length = 30)
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "ClassCather{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", uuid='" + uuid + '\'' +
                ", cls='" + cls + '\'' +
                ", password='" + password + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }
}
