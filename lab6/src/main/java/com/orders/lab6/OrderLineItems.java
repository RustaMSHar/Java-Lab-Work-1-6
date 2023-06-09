package com.orders.lab6;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Builder
@Entity
@AllArgsConstructor
@Data
public class OrderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String producеName;

    private BigDecimal price;
    private Integer quantity;


    @Override
    public String toString() {
        return "OrderLineItems{" +
                "id=" + id +
                ", producеName='" + producеName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public OrderLineItems() {
    }
}
