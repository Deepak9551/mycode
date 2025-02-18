package com.Spring.took.DesignPatter.PartiallyBuilder;

public class Product {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private String created_At;
    private String update_At;
    public Product(Builder b){
        if(b.getPrice() < 0 ){
            this.price = b.getPrice();
        }
        this.name = b.getName();
    }
}
