package com.asz.FinalProject.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Set;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class OrdersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_date")
    private OffsetDateTime orderDate;

    @Column(name = "order_price")
    private OffsetDateTime orderPrice;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "ordersEntity")
    private Set<OrderDetailsEntity> orderDetailsEntities;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity clientEntity;
}
