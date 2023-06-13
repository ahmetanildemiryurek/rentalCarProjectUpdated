package com.rentalCarProjectUpdated.front.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ToLoggedInPageCustomer {
    @GetMapping("/loggedInPageCustomer")
    public String loggedInPage() {
        return "loggedInPageCustomer";
    }
}
