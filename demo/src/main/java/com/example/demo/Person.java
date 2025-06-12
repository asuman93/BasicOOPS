package com.example.demo;

//Parent class
public class Person {

    protected String name;
//    static String test = "test";

    static {
        System.out.println("Person Static Block");
    }

    String getSalaryWithAge(int age){
        return "called Parent getSalaryWithAge";
    }
}
