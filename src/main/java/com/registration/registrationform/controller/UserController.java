package com.registration.registrationform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/register")
    public String getRegister()
    {
        return "register_page";
    }
    @GetMapping("/login")
    public String getLogin()
    {
        return "login_page";
    }

}
