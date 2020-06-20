package com.xa.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by anhnx on 12/05/2020.
 */
@Entity
@Table(name = "product_color")
public class ProductColor {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column(name = "category_id")
    private int categoryId;
    @Column
    private String hex;
    @Column(name = "removed_flag")
    private boolean removedFlag;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "updated_date")
    @Temporal(TemporalType.DATE)
    private Date updatedDate;

    public ProductColor() {
    }

    public ProductColor(String name, int categoryId, String hex, boolean removedFlag, Date createdDate, Date updatedDate) {
        this.name = name;
        this.categoryId = categoryId;
        this.hex = hex;
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

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
