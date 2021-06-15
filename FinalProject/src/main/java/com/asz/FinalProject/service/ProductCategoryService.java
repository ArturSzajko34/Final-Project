package com.asz.FinalProject.service;

import com.asz.FinalProject.entities.ClientEntity;
import com.asz.FinalProject.entities.ProductCategoryEntity;
import com.asz.FinalProject.repositories.ProductCategoryRepository;
import com.asz.FinalProject.rest.dto.ProductCategoryDTO;
import com.asz.FinalProject.util.EntityDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductCategoryService {

    private final ProductCategoryRepository productCategoryRepository;

    public ProductCategoryDTO addProductCategory(ProductCategoryDTO productCategoryDTO) {
        ProductCategoryEntity productCategoryEntity = EntityDtoMapper.mapProductCategoryToEntity(productCategoryDTO);
        productCategoryEntity.setType(productCategoryDTO.getType());
        ProductCategoryEntity saveType = productCategoryRepository.save(productCategoryEntity);
        return EntityDtoMapper.mapProductCategoryToDTO(saveType);
    }

    public void deleteProductCategory(Long id) {
        productCategoryRepository.deleteById(id);
    }

    public ProductCategoryDTO editProductCategory(Long id, ProductCategoryDTO productCategoryDTO) {
        Optional<ProductCategoryEntity> optionalProductCategoryEntity = productCategoryRepository.findById(id);
        if (optionalProductCategoryEntity.isPresent()) {
            ProductCategoryEntity productCategoryEntity = optionalProductCategoryEntity.get();
            productCategoryEntity.setType(productCategoryDTO.getType());
            ProductCategoryEntity saveEditProductCategory = productCategoryRepository.save(productCategoryEntity);
            return EntityDtoMapper.mapProductCategoryToDTO(saveEditProductCategory);
        } else {
            throw new IllegalStateException("the specified identifier " + id +" does not exist");
        }
    }
}
