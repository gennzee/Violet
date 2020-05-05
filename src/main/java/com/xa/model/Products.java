package com.xa.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by anhnx on 05/05/2020.
 */
@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String image;
    @Column
    private String description;
    @Column
    private float price;
    @Column
    private float discounts;
    @Column
    private int sold;
    @Column
    private boolean removed_flag;
    @Column
    @Temporal(TemporalType.DATE)
    private Date created_date;
    @Column
    @Temporal(TemporalType.DATE)
    private Date updated_date;

    public Products() {
    }

    public Products(String name, String image, String description, float price, float discounts, int sold, boolean removed_flag, Date created_date, Date updated_date) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.price = price;
        this.discounts = discounts;
        this.sold = sold;
        this.removed_flag = removed_flag;
        this.created_date = created_date;
        this.updated_date = updated_date;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscounts() {
        return discounts;
    }

    public void setDiscounts(float discounts) {
        this.discounts = discounts;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public boolean isRemoved_flag() {
        return removed_flag;
    }

    public void setRemoved_flag(boolean removed_flag) {
        this.removed_flag = removed_flag;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }
}
