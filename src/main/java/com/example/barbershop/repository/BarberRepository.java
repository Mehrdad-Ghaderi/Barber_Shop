package com.example.barbershop.repository;

import com.example.barbershop.entities.Barber;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BarberRepository extends JpaRepository<Barber, String> {
    @Override
    public List<Barber> findAll();
}
