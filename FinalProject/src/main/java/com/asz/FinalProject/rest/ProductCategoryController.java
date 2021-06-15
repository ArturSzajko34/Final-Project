package com.asz.FinalProject.rest;

import com.asz.FinalProject.rest.dto.ClientDTO;
import com.asz.FinalProject.rest.dto.ProductCategoryDTO;
import com.asz.FinalProject.service.ProductCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProductCategoryController {

   private final ProductCategoryService productCategoryService;

    @PostMapping("/productCategory")
    public ProductCategoryDTO addProductCategory(@RequestBody ProductCategoryDTO productCategoryDTO) {
        return productCategoryService.addProductCategory(productCategoryDTO);
    }

    @DeleteMapping("/productCategory/{id}")
    public ResponseEntity deleteProductCategory(@PathVariable(name = "id") Long id){
        productCategoryService.deleteProductCategory(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/productCategory/{id}")
    public ProductCategoryDTO editClient(@PathVariable(name = "id") Long id,
                                @RequestBody ProductCategoryDTO productCategoryDTO) {
        return productCategoryService.editProductCategory(id,productCategoryDTO);
    }
}
