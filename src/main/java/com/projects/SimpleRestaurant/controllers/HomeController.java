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
    @ResponseBody
    public String helloForm() {
        String html = "<html>" +
                "<body>" +
                "<form method = 'post' action = '/hello'" +
                "<input type = 'text' name = 'name' />" +
                "<input type = 'submit' value = 'Greet Me!' />" +
                "</form>" +
                "</body>" +
                "</html>";
        return html;
    }
}
