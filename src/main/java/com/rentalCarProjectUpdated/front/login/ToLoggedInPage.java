package com.rentalCarProjectUpdated.front.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ToLoggedInPage {

    @GetMapping("/loggedInPage")
    public String loggedInPage() {
        return "loggedInPage";
    }
}


