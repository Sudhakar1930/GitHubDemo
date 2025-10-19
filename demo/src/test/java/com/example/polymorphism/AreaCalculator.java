package com.example.polymorphism;

public class AreaCalculator {
    //Having more than 1 metho with same name but different signature(type & length)
    //square Area
    public int getArea(int side){
        return side * side;
    }
    public double getArea(double side){
        return side * side;
    }
    public double getArea(double length, double breadth){
        return length * breadth;
    }

}
