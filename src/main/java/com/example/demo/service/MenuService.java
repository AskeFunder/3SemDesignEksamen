package com.example.demo.service;

import com.example.demo.model.MenuModel;
import com.example.demo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public void save(MenuModel menuModel)
    {
        menuRepository.save(menuModel);
    }

}
