package com.example.demo.controller;

import com.example.demo.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodItemController {

    @Autowired
    FoodItemService foodItemService;

    @GetMapping (value = "/")
    public String homePage(){
        return "index";
    }

}
