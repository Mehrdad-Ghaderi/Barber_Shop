package com.example.barbershop.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.barbershop.entities.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Override
    public List<Customer> findAll();
}
