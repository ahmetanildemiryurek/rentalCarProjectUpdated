package com.rentalCarProjectUpdated.front.loggedInPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoggedInPageCompany {
 @GetMapping("/loggedInPageCompany")
    public String loggedInPageCompany(){
     return "loggedInPageCompany";
 }

}
