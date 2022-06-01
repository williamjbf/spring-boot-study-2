package com.github.williamjbf.springbootstudy2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {


    @RequestMapping(method = RequestMethod.GET, value = "/registrationcustomer")
    public String start(){
        return "registration/registrationcustomer";
    }
}
