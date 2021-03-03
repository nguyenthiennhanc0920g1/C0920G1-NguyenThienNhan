package Model;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private long birthday;
    private String email;
    private String address;

    public Student() {
    }

    public Student(int id, String name, long birthday, String email, String address) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBirthday() {
        return birthday;
    }
    public String getNgaySinh() {
        Date d=  new Date() ;
        d.setTime(birthday);
        return d.toString();
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
