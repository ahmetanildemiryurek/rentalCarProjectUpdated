package com.rentalCarProjectUpdated.front.logout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutPage {
@GetMapping("/index")
public String logout(){
    return "index";
}

}
