package com.example.demo.service;

import com.example.demo.model.FoodItemModel;
import com.example.demo.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodItemService {

    @Autowired
    private FoodItemRepository foodItemRepository;

    public FoodItemModel getFoodItemById(int id) {
        return foodItemRepository.getOne(id);
    }

    public List<FoodItemModel> listAll() {

        return new ArrayList<>(foodItemRepository.findAll());
    }

    public void save(FoodItemModel foodItemModel) {
        foodItemRepository.save(foodItemModel);
    }
}
