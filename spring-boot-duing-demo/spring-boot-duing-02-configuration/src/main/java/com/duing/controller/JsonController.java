package com.duing.controller;

import com.duing.bean.Food;
import com.duing.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class JsonController {
//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food.meat}")
//    private String meat;
    @Autowired
    private FoodConfig foodConfig ;
@RequestMapping("/json")
 public Food foodShow(){
    Food food  = new Food();
    food.setRice(foodConfig.getRice());
    food.setMeat(foodConfig.getMeat());
     return food;
 }
}