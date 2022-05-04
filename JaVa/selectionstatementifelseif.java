package com.mycompany.firstproject;

import java.util.Scanner;

public class selectionstatementifelseif {

    public static void main(String args[]) {
        // control flow statement consist of two types 1-selection statement or(Decision
        // Making Statement) ,2-Reptation statement
        /*
         * if
         * if else
         * if else if
         */
        int num = 10;
        if (num > 0)
            System.out.println("Positive Number");
        // ex1
        int num = 10;
        if (num == 0)
            System.out.println("Positive Number");
        // ex2
        int num = 10;
        if (num == 02)
            ;
        System.out.println("Positive Number");// print number=10

        // to carry out many operations using if statement
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter integer number");
        num = in.nextInt();

        if (num == 4) {
            System.out.println("Number = 4");
            System.out.println("Thanks");

            // other example
            Scanner in = new Scanner(System.in);
            int num = 0;
            System.out.println("Enter integer number");
            num = in.nextInt();
            if (num > 0)
                System.out.println("Positive");
            else {
                System.out.println("Negative");
            }
            // other example
            Scanner in = new Scanner(System.in);
            int num = 0;
            System.out.println("Enter integer number");
            num = in.nextInt();

            if (num % 2 == 0) // 11%2=5
                if (num > 10) {
                    System.out.println("even");
                    System.out.println("and greater than 10");
                } else {
                    System.out.println("even");
                    System.out.println("and less than 10");
                }
            else {
                System.out.println("odd");
            }
        }
        // other example
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter integer number");
        num = in.nextInt();
        if (num > 10)
            System.out.println("greater than 10 ");
        else if (num == 10)
            System.out.println("equal to 10");
        else if (num < 10) // or else System.out.println("less than 10");
            System.out.println("less than 10");
        num = in.nextInt();

    }

}
