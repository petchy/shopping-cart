package com.example.shoppingcart.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String productCode;
    private String imageUrl;
    private Float priceNormal;
    private Float pricePromotion;
    private Float discountPercent;
    private int storeProvince;
    private float rating;
    private int ratingTotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Float getPriceNormal() {
        return priceNormal;
    }

    public void setPriceNormal(Float priceNormal) {
        this.priceNormal = priceNormal;
    }

    public Float getPricePromotion() {
        return pricePromotion;
    }

    public void setPricePromotion(Float pricePromotion) {
        this.pricePromotion = pricePromotion;
    }

    public Float getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Float discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getStoreProvince() {
        return storeProvince;
    }

    public void setStoreProvince(int storeProvince) {
        this.storeProvince = storeProvince;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getRatingTotal() {
        return ratingTotal;
    }

    public void setRatingTotal(int ratingTotal) {
        this.ratingTotal = ratingTotal;
    }
}
