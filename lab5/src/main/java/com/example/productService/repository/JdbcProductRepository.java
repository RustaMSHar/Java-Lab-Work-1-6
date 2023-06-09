package com.example.productService.repository;

import com.example.productService.model.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@AllArgsConstructor
@Slf4j
public class JdbcProductRepository
{
    private final JdbcTemplate jdbcTemplate;
    public void save(Product p){
        String updateQuery = "INSERT INTO products (id, name, code) VALUES (?, ?, ?)";
        jdbcTemplate.update(updateQuery, p.getId(), p.getName(), p.getCode());
    }

    public List<Product> findAll(){
        String selectQuery = "SELECT id, name, code FROM products";
        var p = jdbcTemplate.query(selectQuery, this::mapToModel);
        return p;
    }

    public Product mapToModel(ResultSet rs, int numColumn) throws SQLException {
        return Product.builder()
                .id(rs.getLong("ID"))
                .name(rs.getString("NAME"))
                .code(rs.getString("CODe"))
                .build();
    }
}
