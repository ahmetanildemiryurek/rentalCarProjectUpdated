package com.rentalCarProjectUpdated.front.loggedInPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArchivePage {
    @GetMapping("/archive")
public String archieve(){
        return "archive";
    }

}
