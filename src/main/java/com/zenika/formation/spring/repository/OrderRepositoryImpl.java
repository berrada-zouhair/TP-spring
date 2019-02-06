package com.zenika.formation.spring.repository;

import com.zenika.formation.spring.domain.Order;
import com.zenika.formation.spring.domain.Product;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//@Repository
//@Profile("!dev")
public class OrderRepositoryImpl implements  OrderRepository {

    private Map<Long, Order> orderById;

    public OrderRepositoryImpl() {
        System.out.println();
    }

    @PostConstruct
    private void initMap() {
        orderById = new HashMap<>();
        Order order = new Order(1L, Arrays.asList(
                new Product(1L, "iphone", 1000D),
                new Product(2L, "galaxy", 1000D)
        ));
        orderById.put(order.getId(), order);
    }

    @PreDestroy
    private void clean() {
        System.out.println("---------------------clean()");
        orderById.clear();
    }

    public Collection<Order> findAll() {
        return orderById.values();
    }
}
