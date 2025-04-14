package com.project.lnfoffice.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/user/profile")
    public String userProfile() {
        return "user";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}