package com.asz.FinalProject.rest.dto;

import com.asz.FinalProject.entities.OrderDetailsEntity;
import com.asz.FinalProject.entities.ProductCategoryEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
public class ProductsDTO {

    private Long id;

    private String name;

    private Double price;

    private ProductCategoryEntity productCategoryEntity;

    private Set<OrderDetailsEntity> orderDetailsEntities;

}
