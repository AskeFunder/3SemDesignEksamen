package com.example.demo.service;

import com.example.demo.model.OrderModel;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void createOrder(OrderModel orderModel) {
        orderRepository.save(orderModel);
    }
}
