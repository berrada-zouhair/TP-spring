package com.zenika.formation.spring.config;

import com.zenika.formation.spring.repository.OrderRepository;
import com.zenika.formation.spring.repository.OrderRepositoryImpl;
import com.zenika.formation.spring.service.OrderService;
import com.zenika.formation.spring.service.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.zenika.formation.spring")
@PropertySource("classpath:/application.properties")
public class OrderConfig {

    @Bean
    public OrderRepository orderRepository() {
        return new OrderRepositoryImpl();
    }

    @Bean
    public static OrderBeanFactoryPostProcessor orderBeanFactoryPostProcessor() {
        return new OrderBeanFactoryPostProcessor();
    }

    @Bean
    public static OrderPostProcessor orderPostProcessor() {
        return new OrderPostProcessor();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(orderRepository());
    }
}
