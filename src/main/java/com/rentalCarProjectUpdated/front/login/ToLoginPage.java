package com.rentalCarProjectUpdated.front.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ToLoginPage {

    @GetMapping("login")
    public String login() {
        return "login";
    }
}


