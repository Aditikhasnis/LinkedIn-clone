//Created by Aditi ❤ 2025 linkedinClone
package com.linkedin.linkedin.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class authController {

    @GetMapping("/")
    public String start()
    {
        return "Hello world";
    }
}
