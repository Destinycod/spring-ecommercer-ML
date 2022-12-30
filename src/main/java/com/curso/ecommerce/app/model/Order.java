package com.curso.ecommerce.app.model;

import java.time.LocalDateTime;

public class Order {

    private Long id;
    private String number;
    private LocalDateTime creationDate;
    private LocalDateTime receivedDate;
    private double total;

    public Order() {
    }

    public Order(Long id, String number, LocalDateTime creationDate, LocalDateTime receivedDate, double total) {
        this.id = id;
        this.number = number;
        this.creationDate = creationDate;
        this.receivedDate = receivedDate;
        this.total = total;
    }

    public Order(String number, LocalDateTime creationDate, LocalDateTime receivedDate, double total) {
        this.number = number;
        this.creationDate = creationDate;
        this.receivedDate = receivedDate;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", creationDate=" + creationDate +
                ", receivedDate=" + receivedDate +
                ", total=" + total +
                '}';
    }
}
