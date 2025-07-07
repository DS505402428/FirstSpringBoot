package com.example.sunnyApplication.controller;

import com.example.sunnyApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greeting() {

        return "Hello Welcome";
    }
    @RequestMapping("/about")
    public String about() {
        return "Sunny Application";
    }
}
