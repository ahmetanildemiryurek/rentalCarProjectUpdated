package com.rentalCarProjectUpdated.front.loggedInPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QueryCar {
    @GetMapping("/queryCar")
    public String queryCar(){

        return "/queryCar";
    }
}
