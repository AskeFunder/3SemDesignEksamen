package com.example.demo.service;

import com.example.demo.model.FoodItemModel;
import com.example.demo.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodItemService {

    @Autowired
    FoodItemRepository foodItemRepository;

    public void save(FoodItemModel foodItemModel) {
        foodItemRepository.save(foodItemModel);
    }
}
