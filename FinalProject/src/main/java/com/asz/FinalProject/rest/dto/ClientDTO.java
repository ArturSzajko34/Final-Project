package com.asz.FinalProject.rest.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
public class ClientDTO {

    private Long id;

    private String name;

    private AddressDTO address;
}
