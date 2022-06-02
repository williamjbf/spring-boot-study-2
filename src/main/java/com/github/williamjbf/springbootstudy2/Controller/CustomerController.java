package com.github.williamjbf.springbootstudy2.Controller;

import com.github.williamjbf.springbootstudy2.model.Customer;
import com.github.williamjbf.springbootstudy2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/registrationcustomer")
    public String start(){
        return "registration/registrationcustomer";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/savecustomer")
    public String save(Customer customer){

        customerRepository.save(customer);

        return "registration/registrationcustomer";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/listcustomers")
    public ModelAndView listAllCustomers(){
        ModelAndView modelAndView = new ModelAndView("registration/registrationcustomer");
        Iterable<Customer> customers = customerRepository.findAll();
        modelAndView.addObject("customers",customers);
        return modelAndView;
    }
}
