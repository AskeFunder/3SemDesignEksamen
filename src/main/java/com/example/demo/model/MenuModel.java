package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "menu")
public class MenuModel {

    @Id
    @GeneratedValue
    int id;

    String name;

    Double price;

    String description;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "menu_fooditem", joinColumns = @JoinColumn(name = "fooditem_id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id"))
    List<FoodItemModel> foodItems = new ArrayList<>();

    public void addFoodItem(FoodItemModel foodItemModel) {
        foodItems.add(foodItemModel);
        foodItemModel.getMenus().add(this);
    }

    public void deleteFoodItem(FoodItemModel foodItemModel){
        foodItems.remove(foodItemModel);
        foodItemModel.getMenus().remove(this);

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

    public List<FoodItemModel> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<FoodItemModel> foodItems) {
        this.foodItems = foodItems;
    }
}
