package com.sunny;
import java.util.Scanner;
public class conditionals {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("plaese enter your salary : ");
        int salary = input.nextInt();
        if (salary>20000) {
            salary += 4000;
        }  else {
            salary +=2000;
        }
        System.out.println("Salary = " + salary);
    }
}
