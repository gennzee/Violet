package com.xa.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by anhnx on 19/04/2020.
 */
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private boolean gender;
    @Column
    private int age;
    @Column
    private String image;
    @Column
    private String role;
    @Column(name = "createdDate")
    @Temporal(TemporalType.DATE)
    private Date createdDate;

    public Users(){}

    public Users(String username, String password, String name, String address, boolean gender, int age, String image, String role, Date createdDate) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.image = image;
        this.role = role;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
