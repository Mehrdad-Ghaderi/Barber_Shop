package com.example.barbershop.controller;

import com.example.barbershop.entities.Customer;
import com.example.barbershop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/sign-up")
    public String displayCustomerSignupForm(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "new-customer";
    }

    @PostMapping("/save")
    public String createCustomer(Customer customer, Model model) {
        //this handles saving the object into the database h2
        customerRepository.save(customer);

        //use redirect to prevent duplicate submissions
        return "redirect:/customers/sign-up";
    }
}
