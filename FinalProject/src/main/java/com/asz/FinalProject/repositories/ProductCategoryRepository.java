package com.asz.FinalProject.repositories;

import com.asz.FinalProject.entities.ProductCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategoryEntity, Long> {
}
