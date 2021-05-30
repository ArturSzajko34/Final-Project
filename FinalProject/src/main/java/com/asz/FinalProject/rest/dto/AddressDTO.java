package com.asz.FinalProject.rest.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class AddressDTO {

    private String city;

    private String country;
}
