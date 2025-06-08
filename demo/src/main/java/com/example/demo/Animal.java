package com.example.demo;

import java.util.Objects;

//Class
public class Animal {

    //Data member or variable
    public String color;
    int height;
    protected int weight;
    private int length;


    //Default Constructor
    public Animal() {
        this.color = "color1";
//        this.height = 10;
//        this.weight = 10;
        this.length = 10;
    }

    //parameterized constructor
    public Animal(String color, int height, int weight, int length) {
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.length = length;
    }

    //Methods
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return height == animal.height && weight == animal.weight && length == animal.length && color.equals(animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, height, weight, length);
    }
}
