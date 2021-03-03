package com.nhan.repositories.model;

public class ProductEDM {
    private String id;
    private String name;
    private Double price;
    private String img;
    private int quantity;

    public ProductEDM() {
    }

    public ProductEDM(String id, String name, Double price, String img, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.img = img;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
