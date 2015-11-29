package whoszus.model.userModel.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 */
@Entity
@Table(name = "mg_userLogin")
public class UserLogin implements Serializable {
    private int id;
    private int uid;
    private String username;
    private String password;
    private Date RegistDate;
    private Date lastLoginDate;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    @Column(name ="uid")
    public int getUid() {
        return uid;
    }
    @Column(name="username")
    public String getUsername() {
        return username;
    }

    @Column(name="password")
    public String getPassword() {
        return password;
    }

    @Column(name="RegistDate")
    public Date getRegistDate() {
        return RegistDate;
    }

    @Column(name="lastLoginDate")
    public Date getLastLoginDate() {
        return lastLoginDate;
    }
}
