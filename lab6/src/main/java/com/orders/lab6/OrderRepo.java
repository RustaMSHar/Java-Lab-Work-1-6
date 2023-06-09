package com.orders.lab6;

import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepo extends ListCrudRepository<Order, Long> {
}
