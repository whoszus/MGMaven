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

}
