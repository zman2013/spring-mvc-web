package com.zmannotes.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zmannotes.spring.web.domain.HomeResponse;

@Controller                     // 标明此类是一个Controller
@RequestMapping("/home")        // 标明Url根路径为/home
public class HomeController {

    @RequestMapping("hi")       // 标明Url子路径为hi
    public String hi(
            @RequestParam(name = "name", defaultValue = "hacker") String name,
            Model model) {

        String msg = String.format("Welcome %s", name);

        HomeResponse response = new HomeResponse(0, msg);
        model.addAttribute("response", response);

        return "home";
    }

}