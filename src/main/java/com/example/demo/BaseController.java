package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("names")
public class BaseController {

    public BaseController() {
        System.out.println("controller");
    }

    /**
     * Autowired куда?
     * 1. Field
     * 2. Constructor
     * 3. Set method
     */

    /*@Autowired
    public BaseController(NameService service) {
        this.service = service;
    }*/


    @Autowired
    @Qualifier(value = "russian")
    private NameService russian;

    @PostConstruct
    public void init() {
        System.out.println("post constract");
    }

    /*@Autowired
    public void setService(NameService service) {
        System.out.println("setter");
        this.service = service;
    }*/

    @GetMapping
    public ResponseEntity<String> getName() {
        return ResponseEntity.ok(russian.getName());
    }


}
