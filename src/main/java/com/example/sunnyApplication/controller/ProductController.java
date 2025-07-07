package com.example.sunnyApplication.controller;

import com.example.sunnyApplication.model.Product;
import com.example.sunnyApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/productList")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
