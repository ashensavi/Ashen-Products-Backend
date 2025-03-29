package edu.icet.ecom.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String category;
    private String imageUrl;
    private boolean available;

    @OneToMany(mappedBy = "product")
    private List<OrderItemEntity> orderItems;


}
