package com.paw2go.products.repository;

import com.paw2go.products.DTO.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Integer> {
}
