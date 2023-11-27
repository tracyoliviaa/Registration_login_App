package dao;

import java.net.IDN;
import java.sql.Timestamp;
import java.util.Date;

public class User
{
    public enum Sex{
        male,
        female,

    }
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private Date birthday;
    private Timestamp registrartionDate;

    private String password;
    private Sex sex;
    private boolean mailSent;
    public int getId(){
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Timestamp getRegistrartionDate() {
        return registrartionDate;
    }

    public void setRegistrartionDate(Timestamp registrartionDate) {
        this.registrartionDate = registrartionDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    public boolean isMailSent() {
        return mailSent;
    }
    public void setMailSent(boolean mailSent) {
        this.mailSent= mailSent;
    }
}
