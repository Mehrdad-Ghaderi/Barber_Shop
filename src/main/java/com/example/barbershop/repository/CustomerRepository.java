package com.example.barbershop.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.barbershop.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {


}
