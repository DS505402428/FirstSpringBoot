package com.example.sunnyApplication.service;

import com.example.sunnyApplication.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> productList = Arrays.asList(
            new Product(101, "Iphone", 1000),
            new Product(102, "Andriod", 700),
            new Product(102, "Microsoft", 800));
    public List<Product> getProducts(){
        return productList;
    }
}
