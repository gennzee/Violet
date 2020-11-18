package com.xa.model;

import org.springframework.stereotype.Component;

/**
 * Created by anhnx on 13/05/2020.
 */
@Component
public class ShoppingCart {

    private String productName;
    private String productImage;
    private ProductStorage productStorage;
    private int quantity;

    public ShoppingCart() {
    }

    public ShoppingCart(String productName, String productImage, ProductStorage productStorage, int quantity) {
        this.productName = productName;
        this.productImage = productImage;
        this.productStorage = productStorage;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public ProductStorage getProductStorage() {
        return productStorage;
    }

    public void setProductStorage(ProductStorage productStorage) {
        this.productStorage = productStorage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
