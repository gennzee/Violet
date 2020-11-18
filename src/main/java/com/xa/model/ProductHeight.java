package com.xa.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by anhnx on 06/07/2020.
 */
@Entity
@Table(name = "product_height")
public class ProductHeight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "removed_flag")
    private int removedFlag;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "updated_date")
    @Temporal(TemporalType.DATE)
    private Date updatedDate;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private Categories categories;

    public ProductHeight() {
    }

    public ProductHeight(String name, int categoryId, int removedFlag, Date createdDate, Date updatedDate) {
        this.name = name;
        this.categoryId = categoryId;
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getRemovedFlag() {
        return removedFlag;
    }

    public void setRemovedFlag(int removedFlag) {
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

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }
}
