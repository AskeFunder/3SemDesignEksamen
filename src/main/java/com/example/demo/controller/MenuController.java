package com.example.demo.controller;


import com.example.demo.model.FoodItemModel;
import com.example.demo.model.MenuModel;
import com.example.demo.service.FoodItemService;
import com.example.demo.service.MenuService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService menuService;
    @Autowired
    FoodItemService foodItemService;

    @GetMapping
    public String menuPage(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("menus", menuService.listAll(page) );
        model.addAttribute("currentPage",page);
        return "menu/index";
    }

    @GetMapping("/create")
    public String menuCreatePage(Model model){
        model.addAttribute("menuModel", new MenuModel());
        model.addAttribute("foodItem",foodItemService.listAll());
        return "menu/create";
    }

    @PostMapping("/save")
    public String saveCourse(@ModelAttribute MenuModel menuModel)
    {
        menuService.save(menuModel);
        return "redirect:/menu/";
    }
}
