package com.curso.ecommerce.app.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private Long id;
    private String name;
    private String description;
    private String image;
    private double price;
    private int amount;

    public Product() {
    }

    public Product(Long id, String name, String description, String image, double price, int amount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.amount = amount;
    }

    public Product(String name, String description, String image, double price, int amount) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
