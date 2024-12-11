package com.example.SDP_Project.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SDP_Project.model.Customer;
import com.example.SDP_Project.model.CustomerLogin;
import com.example.SDP_Project.repository.CustomerRepository;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Save Customer
    public void saveCustomer(Customer customer) {
        // Check if the email is already registered
        if (customerRepository.findByEmail(customer.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email is already in use!");
        }
        customerRepository.save(customer);
    }

    // Authenticate Customer Login
    public String login(CustomerLogin loginDetails) {
        Optional<Customer> customerOpt = customerRepository.findByEmail(loginDetails.getEmail());
        
        if (customerOpt.isEmpty()) {
            return "No account found with that email.";
        }

        Customer customer = customerOpt.get();

        // Match password directly (without encryption)
        if (customer.getPassword().equals(loginDetails.getPassword())) {
            return "Login successful! Welcome, " + customer.getUsername();
        } else {
            return "Invalid password.";
        }
    }
}
