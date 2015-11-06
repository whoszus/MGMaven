package whoszus.model.userModel.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 */
@Entity
@Table(name = "UloginInfo")
public class UloginInfo implements Serializable {
    private int id;
    private int uid;
    private String username;
    private String password;
    private Date RegistDate;
    private Date lastLoginDate;

    public int getId() {
        return id;
    }

    public int getUid() {
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Date getRegistDate() {
        return RegistDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }




    public void setId(int id) {
        this.id = id;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRegistDate(Date registDate) {
        RegistDate = registDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
