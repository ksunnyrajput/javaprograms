
        package com.sunny;
import java.util.Scanner;
        public class comparenumbers {

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in) ;
                System.out.println("enter the number a, b, c");
                float a = input.nextFloat();
                float b = input.nextFloat();
                float c = input.nextFloat()
                        ;
                if (a<b||a<c) {
                    System.out.println(a);
                }  else if (b<c||b<a){
                    System.out.println(b);
                }
                    else {
                        System.out.println(c);
                    }

                }
            }




