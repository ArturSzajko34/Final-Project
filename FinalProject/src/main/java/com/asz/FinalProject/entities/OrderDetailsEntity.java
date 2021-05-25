package com.asz.FinalProject.entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "orderdetails")
@Data
public class OrderDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quantity_ordered")
    private Long quantityOrdered;

    @ManyToOne
    @JoinColumn(name = "orders_id")
    private OrdersEntity ordersEntity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductsEntity productsEntity;

}
