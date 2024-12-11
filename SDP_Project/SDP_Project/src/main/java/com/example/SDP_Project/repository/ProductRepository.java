package com.example.SDP_Project.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SDP_Project.model.Product;

	public interface ProductRepository extends JpaRepository<Product, Integer> {
	    // No additional methods needed for basic CRUD operations
	}



