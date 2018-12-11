package com.example.demo.controller;

import com.example.demo.model.OrderModel;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/create")
    public void createOrder(Model model) {
        model.addAttribute("orderModel", new OrderModel());
    }

    @PostMapping("/create")
    public String createOrder(@ModelAttribute OrderModel orderModel) {
        orderService.createOrder(orderModel);

        return "redirect:/";
    }
}
