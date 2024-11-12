package com.example.demo;

import org.springframework.stereotype.Service;

@Service(value = "russian")
public class RussianNameService implements NameService {
    @Override
    public String getName() {
        return "russian version mursik";
    }
}
