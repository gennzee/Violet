package com.xa.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by anhnx on 06/05/2020.
 */
@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column(name = "color_mark")
    private String colorMark;
    @Column(name = "removed_flag")
    private boolean removedFlag;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "updated_date")
    @Temporal(TemporalType.DATE)
    private Date updatedDate;

    public Categories() {
    }

    public Categories(String name, String colorMark, boolean removedFlag, Date createdDate, Date updatedDate) {
        this.name = name;
        this.colorMark = colorMark;
        this.removedFlag = removedFlag;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
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

    public boolean isRemovedFlag() {
        return removedFlag;
    }

    public void setRemovedFlag(boolean removedFlag) {
        this.removedFlag = removedFlag;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getColorMark() {
        return colorMark;
    }

    public void setColorMark(String colorMark) {
        this.colorMark = colorMark;
    }
}
