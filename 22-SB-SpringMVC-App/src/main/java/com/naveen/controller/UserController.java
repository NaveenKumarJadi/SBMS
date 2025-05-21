package com.naveen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.naveen.model.User;

@Controller
public class UserController {

    @GetMapping("/user")
    public String getUserForm(Model model) {
        model.addAttribute("user", new User());
        return "user-form";  // Name of the view (HTML/Thymeleaf)
    }

    @PostMapping("/user")
    public String submitUser(@ModelAttribute User user, Model model) {
        model.addAttribute("message", "User submitted: " + user.getName());
        return "user-result";  // Another view to show result
    }
}
