package com.example.barbershop.repository;

import com.example.barbershop.entities.Barber;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BarberRepository extends CrudRepository<Barber, Long> {
    @Override
    public List<Barber> findAll();
}
