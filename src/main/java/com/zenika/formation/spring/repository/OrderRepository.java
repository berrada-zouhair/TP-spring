package com.zenika.formation.spring.repository;

import com.zenika.formation.spring.domain.Order;

import java.util.Collection;

public interface OrderRepository {

    Collection<Order> findAll();
}
