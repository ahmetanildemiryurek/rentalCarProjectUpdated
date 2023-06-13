package com.rentalCarProjectUpdated.front.loggedInPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IChangePasswordPage {

    @GetMapping("[/changeMyPassword]")
    public String changePassword(){
        return "changeMyPassword";
    }
}
