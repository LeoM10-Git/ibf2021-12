package com.example.ibf2021d12.controller;

import com.example.ibf2021d12.model.GenerateRandom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/random")
    public String random(@RequestParam("number")Integer number, Model model){
        GenerateRandom generateRandom = new GenerateRandom();

        List<Integer> list = generateRandom.generateRandom(number);
        model.addAttribute("number", number);
        model.addAttribute("list", list);
        return "random";
    }
}
