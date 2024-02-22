package com.example.barbershop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.example.barbershop.entities.Customer;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {

    @Override
    public List<Customer> findAll();
}
