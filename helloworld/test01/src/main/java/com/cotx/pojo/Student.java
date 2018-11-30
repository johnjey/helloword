package com.cotx.pojo;

/**
 * 学生类
 */
public class Student {

    private String sno;
    private String sname;
    private String ssex;
    private String phone;
    private String address;

    public Student(String sno, String sname, String ssex, String phone, String address) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
        this.phone = phone;
        this.address = address;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
