package com.rentalCarProjectUpdated.front.password;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeleteMyAccountPage {

    @GetMapping("/deleteMyAccount")
    public String deleteMyAccount(){

        return "/deleteMyAccount";
    }
}
