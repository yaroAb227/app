package com.group.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    @RequestMapping("home")
    public String home(){

        return "Welcome to string page";
    }
}
