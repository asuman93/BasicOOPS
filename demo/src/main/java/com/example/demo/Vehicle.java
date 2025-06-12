package com.example.demo;

public abstract class Vehicle {

    //Concrete method
    public String getNoOfWheels() {
        return "four";          //body
    }

    //abstract method
    //implement abstraction
    abstract String getType();


}
