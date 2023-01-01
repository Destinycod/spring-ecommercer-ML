package com.curso.ecommerce.app.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private LocalDateTime creationDate;
    private LocalDateTime receivedDate;
    private double total;

    @ManyToOne
    private User user;

    @OneToOne
    private OrderDetail orderDetail;

    public Order() {
    }//REHACER constructores

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
