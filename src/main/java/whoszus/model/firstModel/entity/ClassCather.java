package whoszus.model.firstModel.entity;

/**
 * Created by linyanying on 2015/10/28.
 */
public class ClassCather {
    private String name;
    private String tel;
    private String uuid;
    private String cls;
    private String password;
    private String nick;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
