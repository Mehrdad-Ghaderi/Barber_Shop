package com.example.barbershop.controller;

import com.example.barbershop.entities.Customer;
import com.example.barbershop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

   // @GetMapping  // @GM with no argument will invoke the classes argument in this case "/customers"

    @GetMapping("/list")
    public String displayCustomersList(Model model) {
        var customers = customerRepository.findAll();
        model.addAttribute("customers", customers);
        return "customers/customer-list";
    }

    @GetMapping("/sign-up")
    public String displayCustomerSignupForm(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customers/new-customer";
    }

    @PostMapping("/save")
    public String createCustomer(Customer customer, Model model) {
        customerRepository.save(customer);

        //use redirect to prevent duplicate submissions
        return "redirect:/customers/list";
    }
}
