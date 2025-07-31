package com.projects.SimpleRestaurant.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "hello " + name + "!";
    }

    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloAgain(@PathVariable String name) {
        return "hello " + name + "!";
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }
}
