package com.rentalCarProjectUpdated.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationFrontController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
