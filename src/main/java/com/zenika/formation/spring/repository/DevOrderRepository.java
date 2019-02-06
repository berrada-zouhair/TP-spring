package com.zenika.formation.spring.repository;

import com.zenika.formation.spring.domain.Order;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collection;

//@Repository
//@Profile("dev")
public class DevOrderRepository implements OrderRepository {

    @Override
    public Collection<Order> findAll() {
        return Arrays.asList();
    }
}
