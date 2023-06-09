package com.example.productService.repository;

import com.example.productService.model.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
@Slf4j
public class MongoProductRepository
{
    private final MongoTemplate mongoTemplate;

    public void save(Product p)
    {
        mongoTemplate.save(p);
    }

    public List<Product> findAll()
    {
        return mongoTemplate.findAll(Product.class);
    }
}
