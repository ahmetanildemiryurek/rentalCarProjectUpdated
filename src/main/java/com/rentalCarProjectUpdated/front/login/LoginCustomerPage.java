package com.rentalCarProjectUpdated.front.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginCustomerPage {
@GetMapping("/loginCustomer")
    public String loginCustomer(){
    return "loginCustomer";
}

}
