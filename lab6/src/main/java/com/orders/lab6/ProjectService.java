package com.orders.lab6;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProjectService {

    private final OrderRepo ordersRepo;


    public List<Order> findAll() {
        return ordersRepo.findAll();
    }
    public Optional<Order> getOrderById(Long id){return ordersRepo.findById(id);}
    public void deleteOrderById(Long id){ ordersRepo.deleteById(id); }

    public void save(Order order){
        ordersRepo.save(order);
    }
    public Order createOrder(List<OrderLineItems> orderLineItems){
        String orderNumber = "Заказ-" + (ordersRepo.count() + 1);
        return Order.builder()
                .orderNumber(orderNumber)
                .orderLineItems(orderLineItems)
                .build();
    }

    public OrderLineItems createOrderLineItems(String producеName, BigDecimal price, Integer quantity){
        return OrderLineItems.builder()
                .producеName(producеName)
                .price(price)
                .quantity(quantity)
                .build();
    }
}
