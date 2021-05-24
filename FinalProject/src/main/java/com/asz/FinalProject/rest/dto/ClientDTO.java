package com.asz.FinalProject.rest.dto;
import lombok.Data;


@Data
public class ClientDTO {

    private Long id;

    private String name;

    private AddressDTO address;
}
