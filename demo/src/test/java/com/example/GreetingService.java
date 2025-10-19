package com.example;

import com.example.polymorphism.Dog;

/**
 * Functional interface for greeting services using lambda expressions.
 */
public interface GreetingService
{
    /**
     * Greets a user with a message and age.
     * @param message the greeting message
     * @param age the age of the user
     */
    void greet(String fname, String lname,int age);
}
