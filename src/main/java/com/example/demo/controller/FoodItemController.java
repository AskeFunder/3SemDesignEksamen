package com.example.demo.controller;

import com.example.demo.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/foodItem")
public class FoodItemController {

    @Autowired
    FoodItemService foodItemService;

    @GetMapping (value = "/")
    public String homePage(){
        return "index";
    }

    @GetMapping(value = "/listAll")
    public String listAll() {

    }
}
