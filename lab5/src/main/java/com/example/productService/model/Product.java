package com.example.productService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "product")
public class Product
{
    @Id
    private Long id;
    private String name;
    private String code;

    public Product(String name, String code)
    {
        this.name = name;
        this.code = code;
    }

}
