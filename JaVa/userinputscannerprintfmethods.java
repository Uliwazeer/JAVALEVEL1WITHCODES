package com.mycompany.firstproject;

import java.util.Scanner;

public class userinputscannerprintfmethods {
    public static void main(String args[]) {
        // Some function using user to input date and make users write it support string
        // datatype
        /*
         * next()
         * nextInt()
         * nextBoolean()
         * nextByte()
         * nextShort()
         * nextLong()
         * nextDouble()
         * nextFloat()
         * nextLine()
         * 
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number:");
        int f = in.nextInt();
        System.out.println("Number =" + f);

        // ex on datatype
        float n1, n2;
        System.out.println("Please Enter The First Number:");
        n1 = in.nextFloat();

        System.out.println("Please Enter The Second Number:");
        n2 = in.nextFloat();
        System.out.println("Num1 = " + n1 + " " + "Num2 = " + n2);// OR WE CAN USE FORMATING METHOD =>>
                                                                  // System.out.println("Num1 = %f Num2 = %f%n",n1,n2);
                                                                  // OR//OR WE CAN USE FORMATING METHOD =>>
        // System.out.println("Num1 = %.3f Num2 = %.2f%n",n1,n2);
        /*
         * d : [byte ,short, int ,long]
         * f : [float, double]
         * cC: [character capital c will upper case the letter]
         * sS: [string capital s will upper case all the letters in the string]
         * n : [newline]
         */

        // anthor example
        System.out.println("Enter Value For s:");
        String s = in.nextLine();
        System.out.printf("s = %S", s);

        // anthor example
        System.out.println("Enter Value For s:");
        char s = in.next().charAt(0);
        System.out.printf("s = %S", s);

        // anthor example
        System.out.println("Enter Value For s:");
        int n1, n2, n3, sum;
        System.out.println("Enter Num1:");
        n1 = in.nextInt();
        System.out.println("Enter Num2:");
        n2 = in.nextInt();
        System.out.println("Enter Num3:");
        n3 = in.nextInt();
        sum = n1 + n2 + n3;
        System.out.println("sum = " + sum / 3);
        // OR System.out.println("sum = "+(n1+n2+n3)/3);
        // OR System.out.println("avg = "+sum/3);

    }

}
