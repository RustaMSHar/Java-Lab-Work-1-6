package com.orders.lab6;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController{


    private final ProjectService projectService;

    public OrderController(ProjectService projectService) {
        this.projectService = projectService;
    }


    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        List<Order> orders = projectService.findAll();

        return orders;
    }

    @GetMapping("/orders/{id}")
    public Optional<Order> getOrderById(@PathVariable Long id) throws RecordNotFoundException {
        Optional<Order> order = projectService.getOrderById(id);
        if(order.isPresent()){
            return order;
        } else{
            throw new RecordNotFoundException();
        }
    }

    @GetMapping("/orders/delete/{id}")
    public void deleteOrderById(@PathVariable Long id) throws RecordNotFoundException {
        projectService.deleteOrderById(id);
    }
}


