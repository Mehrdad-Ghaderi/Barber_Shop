package com.example.barbershop.controller;


import com.example.barbershop.entities.Customer;
import com.example.barbershop.repository.BarberRepository;
import com.example.barbershop.entities.Barber;
import com.example.barbershop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller("/home")
public class HomeController {

    @Autowired
    BarberRepository barberRepository;
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/home")
    public String displayHome(Model model) {
        List<Barber> barberList = barberRepository.findAll();
        model.addAttribute("barberList", barberList);

        List<Customer> customerList = customerRepository.findAll();
        model.addAttribute("customerList", customerList);
        return "main/home";
    }

}
