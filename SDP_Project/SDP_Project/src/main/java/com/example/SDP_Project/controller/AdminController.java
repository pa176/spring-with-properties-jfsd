package com.example.SDP_Project.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SDP_Project.repository.CustomerRepository;
import com.example.SDP_Project.repository.ProductRepository;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {

    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    public AdminController(CustomerRepository customerRepository, ProductRepository productRepository) {
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }

    @GetMapping("/admin")
    public ResponseEntity<Map<String, Object>> getAdminOverview() {
        long totalCustomers = customerRepository.count();
        long totalProducts = productRepository.count();

        Map<String, Object> overview = new HashMap<>();
        overview.put("totalCustomers", totalCustomers);
        overview.put("totalProducts", totalProducts);

        return ResponseEntity.ok(overview);
    }
}
