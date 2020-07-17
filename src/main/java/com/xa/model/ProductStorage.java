package com.xa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by anhnx on 12/05/2020.
 */
@Entity
@Table(name="product_storage")
public class ProductStorage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "product_id")
    private int productId;
    @Column
    private float price;
    @Column
    private float discount;
    @Column(name = "color_id")
    private int colorId;
    @Column(name = "size_id")
    private int sizeId;
    @Column(name = "height_id")
    private int heightId;
    @Column
    private int quantity;
    @Column
    private int sold;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    @JsonIgnore
    private Products products;

    @ManyToOne
    @JoinColumn(name = "height_id", referencedColumnName = "id", insertable = false, updatable = false)
    private ProductHeight productHeight;

    @ManyToOne
    @JoinColumn(name = "color_id", referencedColumnName = "id", insertable = false, updatable = false)
    private ProductColor productColor;

    @ManyToOne
    @JoinColumn(name = "size_id", referencedColumnName = "id", insertable = false, updatable = false)
    private ProductSize productSize;

    public ProductStorage() {
    }

    public ProductStorage(int productId, float price, float discount, int colorId, int sizeId, int heightId, int quantity, int sold) {
        this.productId = productId;
        this.price = price;
        this.discount = discount;
        this.colorId = colorId;
        this.sizeId = sizeId;
        this.heightId = heightId;
        this.quantity = quantity;
        this.sold = sold;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public int getHeightId() {
        return heightId;
    }

    public void setHeightId(int heightId) {
        this.heightId = heightId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    @JsonIgnore
    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public ProductColor getProductColor() {
        return productColor;
    }

    public void setProductColor(ProductColor productColor) {
        this.productColor = productColor;
    }

    public ProductSize getProductSize() {
        return productSize;
    }

    public void setProductSize(ProductSize productSize) {
        this.productSize = productSize;
    }

    public ProductHeight getProductHeight() {
        return productHeight;
    }

    public void setProductHeight(ProductHeight productHeight) {
        this.productHeight = productHeight;
    }
}
