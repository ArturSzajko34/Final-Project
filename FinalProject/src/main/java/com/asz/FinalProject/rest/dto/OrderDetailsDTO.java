package com.asz.FinalProject.rest.dto;

import com.asz.FinalProject.entities.OrdersEntity;
import com.asz.FinalProject.entities.ProductsEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
public class OrderDetailsDTO {

    private Long id;

    private Long quantityOrdered;

    private OrdersEntity ordersEntity;

    private ProductsEntity productsEntity;

}
