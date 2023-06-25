package com.rentalCarProjectUpdated.front.loggedInPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RentCar {
    @GetMapping("/rentCar")
    public String rentCar(){
        return "/rentCar";
    }

}
