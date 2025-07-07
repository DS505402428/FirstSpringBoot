package com.example.sunnyApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class Product {
    private int prodId;
    private String prodName;
    private int prodPrice;

}
