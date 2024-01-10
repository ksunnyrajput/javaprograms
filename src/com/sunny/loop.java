package com.sunny;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the name of table: ");
        int table = input.nextInt();
        for (float i=1; i<=10; i++)
        {
        System.out.println(table+" * "+i+" = "+table*i);
        }
    }
}
