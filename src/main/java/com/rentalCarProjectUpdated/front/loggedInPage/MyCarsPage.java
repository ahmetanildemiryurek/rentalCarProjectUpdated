package com.rentalCarProjectUpdated.front.loggedInPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyCarsPage {

    @GetMapping("/myCars")
    public String myCars(){
        return "myCars";
    }
}
