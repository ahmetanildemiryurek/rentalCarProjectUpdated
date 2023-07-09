package com.rentalCarProjectUpdated.front.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChangeMyPasswordCompany {
@GetMapping("/changeMyPasswordCompany")
    public String changeMyPasswordCompany(){

    return "changeMyPasswordCompany";
}

}
