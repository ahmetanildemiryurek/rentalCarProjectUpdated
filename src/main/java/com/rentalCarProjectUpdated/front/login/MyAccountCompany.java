package com.rentalCarProjectUpdated.front.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyAccountCompany {
    @GetMapping("/myAccountCompany")
    public String account2(){
        return "/myAccountCompany";
    }
}
