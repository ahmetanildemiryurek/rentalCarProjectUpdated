package com.rentalCarProjectUpdated.front.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeleteMyAccountCompany {
    @GetMapping("/deleteMyAccountCompany")
    public String delete2(){
        return "/deleteMyAccountCompany";
    }
}

