package com.example.productService.repository;

import com.example.productService.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ListProductRepository
{
    private List<Product> repo = new ArrayList<>();

    public void save(Product model){
        repo.add(model);
    }

    public List<Product> findAll(){
        return repo;
    }
}
