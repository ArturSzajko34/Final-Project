package com.asz.FinalProject.entities;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "productcategory")
@Data
public class ProductCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "productCategoryEntity")
    private Set<ProductsEntity> productsEntities;
}
