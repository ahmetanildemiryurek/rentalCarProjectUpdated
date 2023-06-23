package com.rentalCarProjectUpdated.front.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyRegisterPage {
    @GetMapping("/companyRegister")
    public String register3(){
        return "/companyRegister";
    }
}
