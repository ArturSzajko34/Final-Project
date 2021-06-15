package com.asz.FinalProject.util;

import com.asz.FinalProject.entities.AddressEntity;
import com.asz.FinalProject.entities.ClientEntity;
import com.asz.FinalProject.entities.ProductCategoryEntity;
import com.asz.FinalProject.entities.ProductsEntity;
import com.asz.FinalProject.rest.dto.AddressDTO;
import com.asz.FinalProject.rest.dto.ClientDTO;
import com.asz.FinalProject.rest.dto.ProductCategoryDTO;
import com.asz.FinalProject.rest.dto.ProductsDTO;
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

    public static AddressEntity mapToAddressToEntity (AddressDTO addressDTO){
        AddressEntity addressEntity = new AddressEntity();
        BeanUtils.copyProperties(addressDTO,addressEntity);
        return addressEntity;
    }

    public static ProductsEntity mapToProductToEntity (ProductsDTO productsDTO){
        ProductsEntity productsEntity = new ProductsEntity();
        BeanUtils.copyProperties(productsDTO,productsEntity);
        return productsEntity;
    }

    public static ProductsEntity mapProductToEntity (ProductsDTO productsDTO){
        ProductsEntity productsEntity = new ProductsEntity();
        BeanUtils.copyProperties(productsDTO,productsEntity);
        return productsEntity;
    }

    public static ProductsDTO mapProductToDTO (ProductsEntity productsEntity){
        ProductsDTO productsDTO = new ProductsDTO();
        BeanUtils.copyProperties(productsEntity,productsDTO);
        return productsDTO;
    }

    public static ProductCategoryEntity mapProductCategoryToEntity (ProductCategoryDTO productCategoryDTO){
        ProductCategoryEntity productCategoryEntity = new ProductCategoryEntity();
        BeanUtils.copyProperties(productCategoryDTO,productCategoryEntity);
        return productCategoryEntity;
    }

    public static ProductCategoryDTO mapProductCategoryToDTO (ProductCategoryEntity productCategoryEntity){
        ProductCategoryDTO productCategoryDTO = new ProductCategoryDTO();
        BeanUtils.copyProperties(productCategoryEntity,productCategoryDTO);
        return productCategoryDTO;
    }
}
