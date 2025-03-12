package org.example.minverden.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "/index";
    }

    @GetMapping("/home/niko")
    public String niko(){
        return "/home/niko";
    }

    @GetMapping("/home/valde")
    public String valde(){
        return "/home/valde";
    }
}
