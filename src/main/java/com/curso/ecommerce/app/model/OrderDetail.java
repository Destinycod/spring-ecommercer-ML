package com.curso.ecommerce.app.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetail {

    private Long id;
    private String nombre;
    private double amount;
    private double price;
    private double total;

    public OrderDetail() {
    }

    public OrderDetail(Long id, String nombre, double amount, double price, double total) {
        this.id = id;
        this.nombre = nombre;
        this.amount = amount;
        this.price = price;
        this.total = total;
    }

    public OrderDetail(String nombre, double amount, double price, double total) {
        this.nombre = nombre;
        this.amount = amount;
        this.price = price;
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}
