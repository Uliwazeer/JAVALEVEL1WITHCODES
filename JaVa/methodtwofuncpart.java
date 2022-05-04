package javaproject;

import java.util.Scanner;

public class methodtwofuncpart {
    // writing method in in class or in main
    // public => refer to we use a package on level completely system
    static int min(int n1, int n2, int n3) {
        int minNumber = n1;
        if (minNumber > n2)
            minNumber = n2;
        if (minNumber > n3)
            minNumber = n3;
        return minNumber;
    }

    // ex
    static int min(int n1, int n2, int n3) {
        int minNumber = n1;
        if (minNumber < n2)
            minNumber = n2;
        if (minNumber < n3)
            minNumber = n3;
        return minNumber;
    }

    // ex
    static int max(int n1, int n2, int n3) {
        int minNumber = n1;
        if (minNumber > n2)
            minNumber = n2;
        if (minNumber > n3)
            minNumber = n3;
        return minNumber;
    }

    // ex5
    static float avg(float n1, float n2, float n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        // write a java method to find the smallest number amang three numbers
        // we callback func here
        Scanner in = new Scanner(system.in);
        int x, y, z;
        System.out.println("Enter #1 : ");
        x = in.nextInt();
        System.out.println("Enter #2 : ");
        y = in.nextInt();
        System.out.println("Enter #3 : ");
        z = in.nextInt();
        System.out.println("min = " + min(20, 10, 30));
        // ex
        Scanner in = new Scanner(system.in);
        int x, y, z;
        System.out.println("Enter #1 : ");
        x = in.nextInt();
        System.out.println("Enter #2 : ");
        y = in.nextInt();
        System.out.println("Enter #3 : ");
        z = in.nextInt();
        System.out.println("min = " + max(20, 10, 30));
        // write a java method to complete average of three number
        //ex5
        System.out.println(""avg = "+avg9100,99,48" );

    }

}
