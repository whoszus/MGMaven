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
}
