package com.example.barbershop.controller;

import com.example.barbershop.entities.Barber;
import com.example.barbershop.repository.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/barbers")
public class BarberController {

    @Autowired
    BarberRepository barberRepository;

    @GetMapping("/sign-up")
    public String displayBarberSignupForm(Model model) {
        model.addAttribute("barber", new Barber());
        return "barbers/new-barber";
    }

    @PostMapping("/save")
    public String createBarber(Barber barber, Model model) {
        //barber.setId(barber.getId());
        barberRepository.save(barber);
        return "redirect:/barbers/list";
    }

    @GetMapping("/list")
    public String displayBarberList(Model model) {
        var barbers = barberRepository.findAll();
        model.addAttribute("barbers", barbers);
        return "barbers/barber-list";
    }
}
