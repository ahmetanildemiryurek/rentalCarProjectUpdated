package com.rentalCarProjectUpdated.front.loggedInPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarsPage {

    @GetMapping("/cars")
    public String cars(){
        return "cars";
    }
}

