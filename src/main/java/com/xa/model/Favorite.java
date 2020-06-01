package com.xa.model;

import javax.persistence.*;

/**
 * Created by anhnx on 28/05/2020.
 */
@Entity
@Table(name = "favorite")
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "product_id")
    private int productId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Products products;

    public Favorite() {
    }

    public Favorite(int userId, int productId) {
        this.userId = userId;
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }
}
