package com.example.barbershop.controller;

import com.example.barbershop.entities.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping( "/customers")
public class CustomerController {

    @GetMapping("/sign-up")
    public String displayCustomerSignupForm(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "new-customer";
    }

    @PostMapping("/save")
    public String createCustomer(Customer customer, Model model) {
        //this handles the saving the object into the database h2
        return "";
    }
}
