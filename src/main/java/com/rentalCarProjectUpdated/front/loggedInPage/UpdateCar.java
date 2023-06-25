package com.rentalCarProjectUpdated.front.loggedInPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UpdateCar {
    @GetMapping("/updateCar")
public String updateCar(){
    return "/updateCar";
}

}
