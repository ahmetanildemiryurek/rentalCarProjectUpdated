package com.rentalCarProjectUpdated.front.loggedInPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RentedCar {
    @GetMapping("/rentedCar")
public String rentedCar(){
    return "/rentedCar";
}

}
