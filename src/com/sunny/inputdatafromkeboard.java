package com.sunny;
import java.util.Scanner;

class inputdatafromkeboard {
    public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name:");




        String name = input.nextLine(); // string input
        System.out.println("You entered string: " + name);
        System.out.println("enter your age:");

        int age = input.nextInt(); // integer input
        System.out.println("You entered integer: " + age);
        System.out.println("enter your percentage");


        float percentage = input.nextFloat(); // float input
        System.out.println("You entered float: " + percentage);

        System.out.println("you did well " + percentage  + "%");
        // Closing to avoid memory leak.
        input.close();
    }
}

