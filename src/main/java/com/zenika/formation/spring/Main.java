package com.zenika.formation.spring;

import com.zenika.formation.spring.config.OrderConfig;
import com.zenika.formation.spring.domain.Order;
import com.zenika.formation.spring.repository.OrderRepository;
import com.zenika.formation.spring.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        System.setProperty("order.max", "10");
        System.setProperty("order.max", "10");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OrderConfig.class);
        OrderService orderService = context.getBean(OrderService.class);
        OrderRepository orderRepository = context.getBean(OrderRepository.class);
        Collection<Order> orders = orderService.getAllOrders();
        System.out.println(orders);
        System.out.println("#########" + orderRepository.getClass());
        context.close();

    }
}
