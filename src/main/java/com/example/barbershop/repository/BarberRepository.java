package com.example.barbershop.repository;

import com.example.barbershop.entities.Barber;
import org.springframework.data.repository.CrudRepository;

public interface BarberRepository extends CrudRepository<Barber, Long> {
}
