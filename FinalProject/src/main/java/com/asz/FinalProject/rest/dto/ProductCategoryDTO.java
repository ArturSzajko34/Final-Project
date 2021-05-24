package com.asz.FinalProject.rest.dto;

import lombok.Data;

import java.util.Set;

@Data
public class ProductCategoryDTO {

    private Long id;

    private String type;

    private Set<ProductsDTO> products;
}
