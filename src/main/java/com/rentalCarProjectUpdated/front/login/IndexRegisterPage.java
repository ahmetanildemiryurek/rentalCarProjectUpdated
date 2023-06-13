package com.rentalCarProjectUpdated.front.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexRegisterPage {

    @GetMapping("/register")
    public String register2(){
        return "/register";
    }
}
