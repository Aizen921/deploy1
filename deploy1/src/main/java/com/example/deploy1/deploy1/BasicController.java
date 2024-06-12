package com.example.deploy1.deploy1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class BasicController {
    @Value("${devName}")
    String devName;
    @GetMapping
    public String getDevName(){
        return devName;
    }
}
