package com.example.demo.repository;

import com.example.demo.model.MenuModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuModel, Integer> {
}
