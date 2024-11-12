package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NameServiceImpl implements NameService {

    @Autowired
    private List<Cat> cats;

    @Autowired
    private Map<String, Cat> map;

    @PostConstruct
    public void init() {
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        System.out.println();
    }


    @Override
    public String getName() {
        return "Mursik";
    }
}
