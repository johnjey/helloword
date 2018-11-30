package com.cotx.pojo;

import java.util.Objects;

/**
 * 工程师类
 */
public class Enginner {

    private String name;
    private String eno;
    private String company;
    private int age;

    public Enginner(String name, String eno, String company, int age) {
        this.name = name;
        this.eno = eno;
        this.company = company;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*@Override
    public String toString() {
        return "Enginner{" +
                "name='" + name + '\'' +
                ", eno='" + eno + '\'' +
                ", company='" + company + '\'' +
                ", age=" + age +
                '}';
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Enginner)) return false;
        Enginner enginner = (Enginner) o;
        return age == enginner.age &&
                Objects.equals(name, enginner.name) &&
                Objects.equals(eno, enginner.eno) &&
                Objects.equals(company, enginner.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, eno, company, age);
    }
}
