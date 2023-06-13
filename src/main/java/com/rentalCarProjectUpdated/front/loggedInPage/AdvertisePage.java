package com.rentalCarProjectUpdated.front.loggedInPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class AdvertisePage {

        @GetMapping("/advertise")
        public String advertise(){
            return "advertise";
        }
    }

