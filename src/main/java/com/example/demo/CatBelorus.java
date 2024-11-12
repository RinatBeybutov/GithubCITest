package com.example.demo;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CatBelorus implements Cat {
    private String name = "belorusCat";
}
