package com.Spring.took.DesignPatter.BetterBuilder;

public class Main {
    public static void main(String[] args) {
        Product product = Product.getBuilder().setName("TV").setBrand("SAMSUNG").setPrice(20000).build();
        System.out.println(product);

    }
}
