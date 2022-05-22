package com.example.sofastudy.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/haha/{id}")
    public String haha(@PathVariable("id") Integer id) {
        System.out.println(id);
        return "haha";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
