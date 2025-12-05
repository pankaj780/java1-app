package com.firstApp.firstApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {

    @GetMapping("/test")
    public String ok(){
        return "getting first App";
    }
}
