package com.example.productService;

import com.example.productService.model.Product;
import com.example.productService.repository.JdbcProductRepository;
import com.example.productService.repository.JpaProductRepository;
import com.example.productService.repository.ListProductRepository;
import com.example.productService.repository.MongoProductRepository;
import com.example.productService.utils.CodeGenerator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductServiceApplication
{

    private final ListProductRepository listRepository;
    private final JpaProductRepository jpaRepository;
    private final JdbcProductRepository jdbcRepository;
    private final MongoProductRepository mongoRepository;
    private final CodeGenerator codeGenerator;

    public ProductServiceApplication
            (
                    JpaProductRepository jpaRepository,
                    ListProductRepository listRepository,
                    JdbcProductRepository jdbcRepository,
                    MongoProductRepository mongoRepository,
                    @Qualifier("customCodeGenerator") CodeGenerator codeGenerator
            )
    {
        this.listRepository = listRepository;
        this.jpaRepository = jpaRepository;
        this.jdbcRepository = jdbcRepository;
        this.mongoRepository = mongoRepository;

        this.codeGenerator = codeGenerator;
    }

    public static void main(String[] args)
    {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(MongoProductRepository mongoRepository)
    {
        return args ->
        {
            mongoRepository.save(new Product(1L, "Phone", codeGenerator.createCode()));
            System.out.println(mongoRepository.findAll());
        };
    }

}
