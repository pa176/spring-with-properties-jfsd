package com.example.SDP_Project.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SDP_Project.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
	  Optional<Customer> findByEmail(String email);
	
}




