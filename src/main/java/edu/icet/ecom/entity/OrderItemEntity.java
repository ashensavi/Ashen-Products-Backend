package edu.icet.ecom.entity;

import jakarta.persistence.*;

@Entity
public class OrderItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity order;
}
