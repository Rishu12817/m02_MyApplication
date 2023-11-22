package com.example.javalib;

public class Car    {
//    Attributes
    public int Model_year ;
    public String color ;
    public String brand ;
    public String model ;

//    constructor
    public Car (int year, String color){
        this.Model_year = year ;
        this.color = color ;

    }
//    Methods
    public void drive(){
        System.out.println("Driving");

    }
}
