package com.example.springserver.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 * @data 2019/12/12
 * @time 13:45
 */
@RestController
@RequestMapping("open")
public class OpenController {

    @GetMapping("index")
    public String index() {
        System.out.println("你好世界");
        return "hello world";
    }
}
