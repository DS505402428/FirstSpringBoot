package com.example.sunnyApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class LoginController {
    @RequestMapping("Login")
    public String login(){
        return "Welcome to Login Page";
    }
}
