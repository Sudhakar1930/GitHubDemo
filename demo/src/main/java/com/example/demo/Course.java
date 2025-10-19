package com.example.demo;

import lombok.Data;

@Data
public class Course {
    private int id;
    private String name;
    private String author;
    private double price; // Added field

    public Course(int id, String name, String author, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price; // Assign price
    }
}
