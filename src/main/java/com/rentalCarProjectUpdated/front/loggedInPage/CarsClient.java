package com.rentalCarProjectUpdated.front.loggedInPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarsClient {
@GetMapping("/carsClient")
    public String carsClient(){
    return "/carsClient";
}
}
