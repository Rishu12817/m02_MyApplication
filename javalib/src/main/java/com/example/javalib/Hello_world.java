package com.example.javalib;

import sun.awt.windows.WPrinterJob;

public class Hello_world {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Car c1 = new Car(2345,"RED");
        c1.drive();
        System.out.println(c1.Model_year);
        System.out.println(c1.brand);
        System.out.println(c1.color);

    }
}
