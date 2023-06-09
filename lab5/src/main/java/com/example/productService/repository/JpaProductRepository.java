package com.example.productService.repository;

import com.example.productService.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends JpaRepository<Product,Integer>
{
}
