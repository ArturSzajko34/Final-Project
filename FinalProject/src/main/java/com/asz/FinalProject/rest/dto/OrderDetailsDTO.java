package com.asz.FinalProject.rest.dto;

import com.asz.FinalProject.entities.OrdersEntity;
import com.asz.FinalProject.entities.ProductsEntity;
import lombok.Data;


@Data
public class OrderDetailsDTO {

    private Long id;

    private Long quantityOrdered;

    private OrdersEntity ordersEntity;

    private ProductsEntity productsEntity;

}
