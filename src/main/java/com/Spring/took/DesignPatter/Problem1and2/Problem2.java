package com.Spring.took.DesignPatter.Problem1and2;

import java.util.List;

public class Problem2 {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private String created_At;
    private String update_At;

    private List<String> image;


    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrice(int price) {
        if(price < 0) return;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDiscount(int discount) {
        if(discount < 0) return;
        this.discount = discount;
    }

    public void setCreated_At(String created_At) {
        this.created_At = created_At;
    }

    public void setUpdate_At(String update_At) {
        this.update_At = update_At;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }
}

