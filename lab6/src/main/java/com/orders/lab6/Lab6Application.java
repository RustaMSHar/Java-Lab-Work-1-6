package com.orders.lab6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab6Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab6Application.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(ProjectService projectService) {
//        return arg -> {
//            OrderLineItems item1 = projectService.
//                    createOrderLineItems("Table", BigDecimal.valueOf(1100), 1);
//            OrderLineItems item2 = projectService.
//                    createOrderLineItems("Chair", BigDecimal.valueOf(350), 3);
//            OrderLineItems item3 = projectService.
//                    createOrderLineItems("Sofa", BigDecimal.valueOf(290), 10);
//
//            List<OrderLineItems> itemsLine = new ArrayList<>();
//            itemsLine.add(item1);
//            itemsLine.add(item2);
//            itemsLine.add(item3);
//
//            Order ord = projectService.createOrder(itemsLine);
//            projectService.save(ord);
//
//            projectService.findAll().stream().forEach(System.out::println);
//        };
//    }
}
