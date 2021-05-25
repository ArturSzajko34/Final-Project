package com.asz.FinalProject.entities;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "products")
@Data
public class ProductsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "type")
    private ProductCategoryEntity productCategoryEntity;

    @OneToMany(mappedBy = "productsEntity")
    private Set<OrderDetailsEntity> orderDetailsEntities;
}
