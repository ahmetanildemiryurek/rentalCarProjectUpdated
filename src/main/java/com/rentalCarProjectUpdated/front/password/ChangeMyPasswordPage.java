package com.rentalCarProjectUpdated.front.password;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ChangeMyPasswordPage {

        @GetMapping("/changeMyPassword")
        public String changeMyPassword(){

            return "/changeMyPassword";
        }

    }

