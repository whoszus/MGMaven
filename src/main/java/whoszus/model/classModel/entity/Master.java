package whoszus.model.classModel.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2015/11/6.
 * master class
 * the entity of class
 */


public class Master implements Serializable {

    private int id;
    private String claseeName;
    private Date CreateDate;
    private String adminidtrator;
    private int level;
    private String rate1;

    public int getId() {
        return id;
    }

    public String getClaseeName() {
        return claseeName;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public String getAdminidtrator() {
        return adminidtrator;
    }

    public int getLevel() {
        return level;
    }

    public String getRate1() {
        return rate1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClaseeName(String claseeName) {
        this.claseeName = claseeName;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    public void setAdminidtrator(String adminidtrator) {
        this.adminidtrator = adminidtrator;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setRate1(String rate1) {
        this.rate1 = rate1;
    }
}
