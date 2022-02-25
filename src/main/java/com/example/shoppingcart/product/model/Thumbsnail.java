package com.example.shoppingcart.product.model;

import javax.persistence.*;

@Entity
public class Thumbsnail {
    @Id
    private int id;

    private String url;

    @ManyToOne
    @JoinColumn(name="product_id", nullable = false)
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
