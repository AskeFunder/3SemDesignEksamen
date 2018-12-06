package com.example.demo.controller;

import com.example.demo.model.FoodItemModel;
import com.example.demo.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/food-item")
public class FoodItemController {

    @Autowired
    FoodItemService foodItemService;

    @GetMapping
    public String listAll(Model model) {
        model.addAttribute("foodItems", foodItemService.listAll());

        return "food-item/food-items";
    }

    @GetMapping (value = "/create")
    public String create(Model model){
        model.addAttribute("foodItemModel", new FoodItemModel());
        return "food-item/create";
    }

    @PostMapping("/save")
    public String create(@ModelAttribute FoodItemModel foodItemModel){
        foodItemService.save(foodItemModel);
        return "redirect:/food-item";
    }

    @GetMapping("/edit")
    public FoodItemModel foodItemEditPage(int id){
        return foodItemService.getFoodItemById(id);
    }
    @PostMapping("/edit/save/")
    public String saveEditCourse (@ModelAttribute FoodItemModel foodItem, int id)
    {
        foodItemService.editFoodItem(foodItem, id);
        return "redirect:/food-item";
    }

    @GetMapping(value = "/delete/{id}")
    public String delete(Model model, @PathVariable(value = "id") int id) {
        model.addAttribute("foodItemModel", foodItemService.getFoodItemById(id));

        return "food-item/delete";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String delete(@PathVariable(value = "id") int id) {

        return "redirect:/";
    }
}