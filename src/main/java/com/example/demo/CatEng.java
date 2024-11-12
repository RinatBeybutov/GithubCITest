package com.example.demo;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("mybean")
@Order(5)
public class CatEng implements Cat {
    private String name = "engCat";
}
