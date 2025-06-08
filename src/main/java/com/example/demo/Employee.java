package com.example.demo;

import java.util.Objects;

//Child class for which parent class is Person
public class Employee extends Person {
    //extend is a keyword, which is usd to inherit the properties or features or methods os parent class

    private int age;
    private int salary;
    private int height;
    private String name;

    //Default Constructor
    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentName(String name) {
        super.name = name;
    }

    public String getParentName() {
        return super.name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Method Overloading
    public String getSalaryWithAge(int age){
        return "called getSalaryWithAge";
    }

    public String invokeParentMethod(int age) {
        return super.getSalaryWithAge(age);
    }

    public String getSalaryWithAge(String name){
        return "called getSalaryWithAge with name argument";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", height=" + height +
                ", name='" + this.name + '\'' +
                ", parent name='" + super.name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && salary == employee.salary && height == employee.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, salary, height);
    }
}
