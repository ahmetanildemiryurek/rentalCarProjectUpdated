package com.rentalCarProjectUpdated.front.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyLogin {

    @GetMapping("/companyLogin")
    public String companyLoginPage() {
        return "companyLogin";
    }
}