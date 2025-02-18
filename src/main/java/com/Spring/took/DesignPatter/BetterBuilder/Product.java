package com.Spring.took.DesignPatter.BetterBuilder;

public class Product {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private String created_At;
    private String update_At;

    private Product (Builder b){
    this.name = b.getName();
    if(b.getPrice() < 0 ){
     return;
    }
    else {
        this.price = b.getPrice();
    }

    this.brand = b.getBrand();
    this.category = b.getCategory();
    this.discount = b.getDiscount();
    this.desc = b.getDesc();
    this.created_At = b.getCreated_At();
    this.update_At = b.getUpdate_At();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", discount=" + discount +
                ", created_At='" + created_At + '\'' +
                ", update_At='" + update_At + '\'' +
                '}';
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String desc;
        private int price;
        private String brand;
        private String category;
        private int discount;
        private String created_At;
        private String update_At;

        Builder(){

        }
        public Product build(){
            return new Product(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder  setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setDiscount(int discount) {
            this.discount = discount;
            return this;
        }

        public Builder setCreated_At(String created_At) {
            this.created_At = created_At;
            return this;
        }

        public Builder setUpdate_At(String update_At) {
            this.update_At = update_At;
            return this;
        }

        public String getName() {
            return name;
        }

        public String getDesc() {
            return desc;
        }

        public int getPrice() {
            return price;
        }

        public String getBrand() {
            return brand;
        }

        public String getCategory() {
            return category;
        }

        public int getDiscount() {
            return discount;
        }

        public String getCreated_At() {
            return created_At;
        }

        public String getUpdate_At() {
            return update_At;
        }
    }
}
