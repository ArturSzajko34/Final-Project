package com.asz.FinalProject.util;

import com.asz.FinalProject.entities.AddressEntity;
import com.asz.FinalProject.entities.ClientEntity;
import com.asz.FinalProject.rest.dto.AddressDTO;
import com.asz.FinalProject.rest.dto.ClientDTO;
import org.springframework.beans.BeanUtils;

public class EntityDtoMapper {

    public static ClientDTO mapClientToDTO(ClientEntity clientEntity) {
        ClientDTO clientDTO = new ClientDTO();
        BeanUtils.copyProperties(clientEntity, clientDTO);
        return clientDTO;
    }

    public static ClientEntity mapClientToEntity(ClientDTO clientDTO) {
        ClientEntity clientEntity = new ClientEntity();
        BeanUtils.copyProperties(clientDTO, clientEntity);
        return clientEntity;
    }

    public static AddressDTO mapAddressToDTO(AddressEntity addressEntity){
        AddressDTO addressDTO = new AddressDTO();
        BeanUtils.copyProperties(addressEntity,addressDTO);
        return addressDTO;
    }

    public static AddressEntity mapToAddressToEntity (AddressDTO addressDTO){
        AddressEntity addressEntity = new AddressEntity();
        BeanUtils.copyProperties(addressDTO,addressEntity);
        return addressEntity;
    }


}
