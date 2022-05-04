package javaproject;

import java.util.Scanner;

public class repetitioncontrolstatementDOWHILELOOP {
    public static void main(String args[]) {
        // Repetition control statement contain two types of conditional statement
        // 1)while loop
        // 2)do-while loop
        // ex on while to print a word 5 times
        int c = 0;
        while (c < 5) {
            System.out.println("Uli");
            c++;
        }
        // ex on do-while and structre of Do-while
        int c = 0;
        do {
            System.out.println("Uli");
            c++;
        } while (c < 5);// should while be right of curley brackets and ending of semicolmn
        // difference of while and do-while =>carry out on boudy (Uli) 1 time at least
        // then check on condition(while)
        // we can give a varaible initial value using do-while
        // ex give initial value
        char letter = 'a';
        int c = 0;
        Scanner in = new Scanner(System.in);
        do {
            letter = in.next().charAt(0);
            if (letter != 'q')
                c++;
        } while (letter != 'q');
        System.out.println("count = " + (c - 1)); // count=3

         // other example
        Scanner in = new Scanner(System.in);
        // calculator with arithmetic operator on two varible + - * / %
        System.out.println("enter one of these operators: * / % + - ");
        char c;
        do{
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
    }while(c=='*'||c=='/'||c=='%'||c=='+'||c=='-');

    }

    // NOTES THAT WHILE AND DO-WHILE CAN GIVE YOU SAME EFFECIENCY AND DO-WHILE TREAT
    // WITH MENUS

}
