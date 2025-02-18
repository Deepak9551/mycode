package com.Spring.took.DesignPatter.Problem1and2;

import java.util.List;

public class Problem {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private String created_At;
    private String update_At;

    private List<String> image;

    public Problem(String name, String desc, int price, String brand, String category, int discount, String created_At, String update_At, List<String> image) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.discount = discount;
        this.created_At = created_At;
        this.update_At = update_At;
        this.image = image;
    }
}
