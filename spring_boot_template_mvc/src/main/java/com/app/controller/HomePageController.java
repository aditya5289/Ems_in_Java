package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomePageController {

    @GetMapping("/")
    public String homePage() {
    	System.out.println("inside home page controller");
        return "/department/departments";  // Removed the leading slash to fix the view name
    }
}
