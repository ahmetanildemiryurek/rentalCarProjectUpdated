package com.rentalCarProjectUpdated.front.password;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForgetPassword {
    @GetMapping("/forgetPassword")
    public String forgetPassword(){

        return "/forgetPassword";
    }

}
