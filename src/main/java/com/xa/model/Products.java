package com.xa.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by anhnx on 05/05/2020.
 */
@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String description;
    @Column(name="category_id")
    private int categoryId;
    @Column(name = "removed_flag")
    private boolean removedFlag;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "updated_date")
    @Temporal(TemporalType.DATE)
    private Date updatedDate;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private Categories categories;

    @OneToMany(mappedBy = "productId")
    private List<ProductImage> productImageList;

    @OneToMany(mappedBy = "productId")
    private List<ProductStorage> productStorageList;

    public Products() {
    }

    public Products(String name, String description, int categoryId, boolean removedFlag, Date createdDate, Date updatedDate) {
        this.name = name;
        this.description = description;
        this.categoryId = categoryId;
        this.removedFlag = removedFlag;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public List<ProductStorage> getProductStorageList() {
        return productStorageList;
    }

    public void setProductStorageList(List<ProductStorage> productStorageList) {
        this.productStorageList = productStorageList;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public List<ProductImage> getProductImageList() {
        return productImageList;
    }

    public void setProductImageList(List<ProductImage> productImageList) {
        this.productImageList = productImageList;
    }
}
