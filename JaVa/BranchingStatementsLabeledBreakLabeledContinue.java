package javaproject;

import java.util.Scanner;

//video very important
public class BranchingStatementsLabeledBreakLabeledContinue {
    public static void main(String[] args) {
        // Labeled Break Statement
        // Labeled Continue Statement
        test: {
            if (5 < 6)
                break test;
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
        }
        System.out.println("5");

        // ex
        stop: {
            for (int row = 1; row <= 10; row++) {
                for (int column = 1; column <= 5; column++) {
                    if (row == 5)
                        break stop;
                    System.out.println("* ");
                }
                System.out.println("");
            }
        }
        // ex
        stop: for (int row = 1; row <= 10; row++) { // it is not important to put curley brackets

            for (int column = 1; column <= 5; column++) {
                if (row == 5)
                    break stop;
                System.out.println("* ");
            }
            System.out.println("");
        }
        // ex
        for (int row = 1; row <= 10; row++) { // it is not important to put curley brackets
            System.out.println();
            for (int column = 1; column <= 5; column++) {
                if (column > row)
                    continue;
                System.out.println("* ");
            }

        }

    }

}
