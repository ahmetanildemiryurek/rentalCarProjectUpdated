package com.rentalCarProjectUpdated.front.loggedInPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyAccountPage {

    @GetMapping("/myAccount")
    public String myAccount(){
        return "myAccount";
    }

}
