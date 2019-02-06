package com.zenika.formation.spring.service;

import com.zenika.formation.spring.domain.Order;

import java.util.Collection;

public interface OrderService {

    Collection<Order> getAllOrders();
}
