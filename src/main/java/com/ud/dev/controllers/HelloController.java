package com.ud.dev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello(@RequestParam(name = "name", defaultValue = "World") String name) {
        return String.format("Hello %s", name);
    }

    @GetMapping("/")
    public @ResponseBody String greeting() {
        return "Testing world";
    }
}
