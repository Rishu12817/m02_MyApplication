package com.example.javalib;

import java.util.Scanner;

public class reverse_the_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        char[] ch = sc.nextLine().toCharArray();
        System.out.println("Output: ");
         for (int i = ch.length-1; i >= 0; i--) {
               System.out.print(ch[i]);
         }System.out.println("\n");
    }
}
