package com.myfirstspringbootproject.springbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {

    @RequestMapping("/")
    public String display() {
        return "index";
    }
}
