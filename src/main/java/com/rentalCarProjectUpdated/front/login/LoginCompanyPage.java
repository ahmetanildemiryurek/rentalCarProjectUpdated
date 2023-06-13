package com.rentalCarProjectUpdated.front.login;

import lombok.CustomLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginCompanyPage {
    @GetMapping("/login")
    public String loginCompany(){
        return  "login";
    }

}
