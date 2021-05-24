package com.asz.FinalProject.rest.dto;

import com.asz.FinalProject.entities.OrderDetailsEntity;
import com.asz.FinalProject.entities.ProductCategoryEntity;
import lombok.Data;

import java.util.Set;

@Data
public class ProductsDTO {

    private Long id;

    private String name;

    private Double price;

    private ProductCategoryEntity productCategoryEntity;

    private Set<OrderDetailsEntity> orderDetailsEntities;

}
