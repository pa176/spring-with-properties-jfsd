package com.example.SDP_Project.service;

	
	

	
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SDP_Project.model.Product;
import com.example.SDP_Project.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get a product by ID
    public Product getProductById(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(null);
        return optionalProduct.orElse(null); // Return null if not found
    }
}



