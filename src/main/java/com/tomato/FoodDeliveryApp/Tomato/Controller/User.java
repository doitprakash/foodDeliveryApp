package com.tomato.FoodDeliveryApp.Tomato.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

    @GetMapping()
    public String m1(){
      return "Hello World-hi";
    }
}
