package com.example.SDP_Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "products_table") // Optional: Specifies the table name in the database
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrementing primary key
    private int id;

    @Column(name = "name", nullable = false, length = 100) // Specifies column name, constraints
    private String name;

    @Column(name = "description", nullable = false, length = 500) // Allows more detailed description
    private String description;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "image", length = 255) // URL or path to image
    private String image;

    @Column(name = "details", length = 1000) // Detailed product info
    private String details;

    @Column(name = "video_link", length = 500) // URL for video link
    private String videoLink;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }
}
