package com.duing.controller;

import com.duing.bean.Food;
import com.duing.bean.Vegetables;
import com.duing.config.FoodConfig;
import com.duing.config.VegetablesConfig;
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
    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;
    @Autowired
    private FoodConfig foodConfig ;
@RequestMapping("/json")
 public Food foodShow(){
    Food food  = new Food();
    food.setRice(foodConfig.getRice());
    food.setMeat(foodConfig.getMeat());
    food.setSauce(foodConfig.getSauce());
     return food;
 }
 @Autowired
 private VegetablesConfig vegetablesConfig;
 @RequestMapping("/vegetables")
 public Vegetables vegetablesShow(){
    Vegetables vegetables = new Vegetables();
    vegetables.setPotato(vegetablesConfig.getPotato());
     vegetables.setEggplant(vegetablesConfig.getEggplant());
     vegetables.setGreenpeper(vegetablesConfig.getGreenpeper());
    return vegetables;
 }

 @RequestMapping("/jasypt")
 public String jasyptUserPassword(){
     StringBuilder stringBuilder = new StringBuilder();
     stringBuilder.append(username);
     stringBuilder.append("\t");
     stringBuilder.append(password);
     return stringBuilder.toString();
 }
}
