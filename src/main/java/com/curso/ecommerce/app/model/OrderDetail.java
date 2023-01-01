package com.curso.ecommerce.app.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "order_details")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private double amount;
    private double price;
    private double total;

    @OneToOne
    private Order order;

    @OneToOne
    private Product product;

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
