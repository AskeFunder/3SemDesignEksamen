package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "foodItem"   )
public class FoodItemModel {

    @Id
    @GeneratedValue
    int id;

    String name;
    Double price;
    String description;

    public List<MenuModel> getMenus() {
        return menus;
    }

    @ManyToMany(mappedBy = "foodItems")
    private List<MenuModel> menus = new ArrayList<>();

    public FoodItemModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
