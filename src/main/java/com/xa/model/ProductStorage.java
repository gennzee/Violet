package com.xa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Created by anhnx on 12/05/2020.
 */
@Entity
@Table(name="product_storage")
public class ProductStorage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "product_id")
    private Integer productId;
    @Column
    private Float price;
    @Column
    private Float discount;
    @Column(name = "color_id")
    private Integer colorId;
    @Column(name = "size_id")
    private Integer sizeId;
    @Column(name = "height_id")
    private Integer heightId;
    @Column
    private Integer quantity;
    @Column
    private Integer sold;

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

    @OneToMany(mappedBy = "productStorageId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderProduct> orderProductList;

    public ProductStorage() {
    }

    public ProductStorage(Integer productId, Float price, Float discount, Integer colorId, Integer sizeId, Integer heightId, Integer quantity, Integer sold) {
        this.productId = productId;
        this.price = price;
        this.discount = discount;
        this.colorId = colorId;
        this.sizeId = sizeId;
        this.heightId = heightId;
        this.quantity = quantity;
        this.sold = sold;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public Integer getHeightId() {
        return heightId;
    }

    public void setHeightId(Integer heightId) {
        this.heightId = heightId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
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

    public List<OrderProduct> getOrderProductList() {
        return orderProductList;
    }

    public void setOrderProductList(List<OrderProduct> orderProductList) {
        this.orderProductList = orderProductList;
    }
}
