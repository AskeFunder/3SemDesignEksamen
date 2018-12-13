package com.example.demo.controller;

import com.example.demo.model.OrderModel;
import com.example.demo.repository.MenuRepository;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    MenuRepository menuRepository;

    @GetMapping
    public String listAll(Model model) {
        model.addAttribute("orders", orderService.listAll());

        return "order/index";
    }

    /*@GetMapping("/order/order/")
    public String menuOrder(@RequestParam("id") int id, @RequestParam("quantity") int quantity)
    {
        return "hello"
    }*/

    @GetMapping("/create")
    public void createOrder(Model model, @RequestParam("id") Integer id, @RequestParam("quantity") Integer quantity) {
        model.addAttribute("menu", menuRepository.getOne(id));
        model.addAttribute("quantity", quantity);
        model.addAttribute("orderModel", new OrderModel());
    }

    @PostMapping("/create")
    public String createOrder(@ModelAttribute OrderModel orderModel) {
        orderService.createOrder(orderModel);

        return "redirect:/";
    }

    @GetMapping("/delete")
    public OrderModel orderDeletePage (int id) {
        return orderService.getOne(id);
    }

    @DeleteMapping("/delete/confirm")
    public String deleteConfirmed(@ModelAttribute OrderModel orderModel, int id) {
        orderService.delete(orderModel, id);
        return "redirect:/order";
    }
}
