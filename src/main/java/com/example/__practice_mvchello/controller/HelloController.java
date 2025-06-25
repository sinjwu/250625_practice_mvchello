package com.example.__practice_mvchello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String opensesame() {
        return "hello";
    }
}
