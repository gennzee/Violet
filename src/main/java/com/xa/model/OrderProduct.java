package com.xa.model;

import javax.persistence.*;

/**
 * Created by anhnx on 12/05/2020.
 */
@Entity
@Table(name = "order_product")
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "product_storage_id")
    private int productStorageId;
    @Column
    private int quantity;
    @Column
    private float price;

    public OrderProduct() {
    }

    public OrderProduct(int orderId, int productStorageId, int quantity, float price) {
        this.orderId = orderId;
        this.productStorageId = productStorageId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductStorageId() {
        return productStorageId;
    }

    public void setProductStorageId(int productStorageId) {
        this.productStorageId = productStorageId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
