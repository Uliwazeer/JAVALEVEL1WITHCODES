package com.mycompany.firstproject1;

import java.util.Scanner;

public class selectionstatementswitch {
    public static void main(String args[]) {
        // control flow statement selection statement
        // switch have groub of commands to welcome values int and resalt that carry out
        // some some commands
        // after every case check is this case equal to x if true do break if no of all
        // cases equal to x do value in default
        int x = 2;
        switch (x) {
            case 1:// constant value not 10<20 but 10 or 20:
                System.out.println("case #1");
                break;
            case 2:
                System.out.println("case #2");
                break;
            case 3:
                System.out.println("case #3");
                break;
            case 4:
                System.out.println("case #4");
                break;
            case 5:
                System.out.println("case #5");
                break;

            default:
                System.out.println("it is not optional");
        }
        // other example when you have the same result
        Scanner in = new Scanner(System.in);
        System.out.println("please the number of day");
        int day = in.nextInt();
        switch (day) {// data which welcome in switch statement byte,chort,char,and int primitive data
                      // types strings dont write a float number else if like=>float f=5;
            case 1:

                // break;
            case 2:

                // break;
            case 3:

                // break;
            case 4:

                // break;
            case 5:
                System.out.println("week day");
                break;
            case 6:

                // break;
            case 7:
                System.out.println("weekend");
                break;

            default:
                System.out.println("it is not an option");
        }
        // other example
        Scanner in = new Scanner(System.in);
        // calculator with arithmetic operator on two varible + - * / %
        System.out.println("enter one of these operators: * / % + - ");
        char c = in.next().charAt(0);
        int n1, n2;
        System.out.println("enter n1:");
        n1 = in.nextInt();
        System.out.println("enter n2:");
        n2 = in.nextInt();
        switch (c) {
            case '*':
                System.out.println("res = " + (n1 * n2));
                break;
            case '/':
                System.out.println("res = " + (n1 / n2));
                break;
            case '%':
                System.out.println("res = " + (n1 % n2));
                break;
            case '+':
                System.out.println("res = " + (n1 + n2));
                break;
            case '-':
                System.out.println("res = " + (n1 - n2));
                break;
            default;
            System.out.println("it is an option");


        }
        //if we deal with strings we use double qoutations
         Scanner in = new Scanner(System.in);
        System.out.println("enter the letter:");
        char c = in.next().charAt(0);
        string n="AAA";
        switch (n) {
            case "AAA":
                System.out.println(n);
                break;
            case "BB":
                System.out.println(n);
                break;
            case "CCC":
                System.out.println(n);
                break; 
                default;
            System.out.println("it is an option");
            //we can write more than line
              string n="AAA";
        switch (n) {
            case "AAA":
                System.out.println(n);
                if
                System.out.println(n);
                System.out.println(n);
                System.out.println(n);
                System.out.println(n);
                System.out.println(n);
                System.out.println(n);
                System.out.println(n);
                System.out.println(n);
                System.out.println(n);
                break;
        }
            case "BB":
                System.out.println(n);
                break;
            case "CCC":
                System.out.println(n);
                break; 
                default;
            System.out.println("it is an option");

// video #9 with adel nasimis very important
             // other example
        Scanner in = new Scanner(System.in);
        // calculator with arithmetic operator on two varible + - * / %
        System.out.println("enter one of these operators: * / % + - ");
        
        int n1, n2;
        System.out.println("enter n1:");
        n1 = in.nextInt();
        System.out.println("enter n2:");
        n2 = in.nextInt();
        System.out.println("Enter one of theses operators");
        System.out.println("(*) -> Multiply");
        System.out.println("(/) -> Diviation");
        System.out.println("(%) -> Reminder");
        System.out.println("(+) -> Addition");
        System.out.println("(-) -> Substraction");
        System.out.println("or press any other key to exist");
        char c = in.next().charAt(0);
        switch (c) {
            case '*':
                System.out.println("res = " + (n1 * n2));
                break;
            case '/':
                System.out.println("res = " + (n1 / n2));
                break;
            case '%':
                System.out.println("res = " + (n1 % n2));
                break;
            case '+':
                System.out.println("res = " + (n1 + n2));
                break;
            case '-':
                System.out.println("res = " + (n1 - n2));
                break;
            default;
            System.out.println("it is an option");


        }
    }

}
