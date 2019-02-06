package com.zenika.formation.spring.service;

import com.zenika.formation.spring.domain.Order;
import com.zenika.formation.spring.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collection;

//@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Value("${order.max}")
    private int maxOrders;

    public OrderServiceImpl(OrderRepository devOrderRepository) {
        this.orderRepository = devOrderRepository;
    }

    @Override
    public Collection<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
