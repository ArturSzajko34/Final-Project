package com.asz.FinalProject.rest.dto;

import com.asz.FinalProject.entities.ClientEntity;
import com.asz.FinalProject.entities.OrderDetailsEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
public class OrdersDTO {

    private Long id;

    private OffsetDateTime orderDate;

    private OffsetDateTime orderPrice;

    private String status;

    private Long clientId;

    private Set<OrderDetailsEntity> orderDetailsEntities;

    private ClientEntity clientEntity;

}
