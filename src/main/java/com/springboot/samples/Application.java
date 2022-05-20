package com.springboot.samples;

import com.springboot.samples.model.Order;
import com.springboot.samples.repository.OrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application {

    @Autowired
    private OrderDAO orderDAO;


    @Bean
    public Supplier<List<Order>> orders(){
        return () -> orderDAO.buildOrders();
    }


    @Bean
    public Function<String,List<Order>> findByOrderName(){
        return (input) -> orderDAO.buildOrders().stream()
                .filter(order -> order.getName().equals(input)).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
