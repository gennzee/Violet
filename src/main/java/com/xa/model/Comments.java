package com.xa.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by anhnx on 24/06/2020.
 */
@Entity
@Table(name = "comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "new_id")
    private int newId;
    @Column
    private String name;
    @Column
    private String email;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column
    private String comment;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;

    public Comments() {
    }

    public Comments(int newId, String name, String email, String mobileNumber, String comment, Date createdDate) {
        this.newId = newId;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.comment = comment;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
