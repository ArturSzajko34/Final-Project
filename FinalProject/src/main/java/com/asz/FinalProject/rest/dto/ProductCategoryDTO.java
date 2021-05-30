package com.asz.FinalProject.rest.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
public class ProductCategoryDTO {

    private Long id;

    private String type;

    private Set<ProductsDTO> products;
}
