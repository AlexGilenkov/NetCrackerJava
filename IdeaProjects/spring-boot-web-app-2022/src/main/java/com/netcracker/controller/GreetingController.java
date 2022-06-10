package com.netcracker.controller;

import com.netcracker.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @GetMapping("/greeting-get")
    public String greetingSubmit(@ModelAttribute Greeting greeting, HttpServletResponse response) {

        Cookie cookie = new Cookie("content", greeting.getContent());
        cookie.setMaxAge(24*60*60);

        response.addCookie(cookie);

        return "result";
    }
}
