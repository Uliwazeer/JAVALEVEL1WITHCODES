package javaProject;

import java.util.Scanner;

public class RepetitionControlStatementNestedLoops {
    public static void main(String[] args) {
        // we talk about nested loop (loop inside loop)
        // nested loop in level two
        for (int i = 1; i <= 5; i++) {// outer loop (outside loop)
            System.out.println("outer loop " + i);
            for (int j = 1; j <= 3; j++) {// inner loop (inside loop)
                System.out.println("Nested loop " + j);
            }
        }
        // ex nested loop in level three
        for (int i = 1; i <= 5; i++) {// outer loop (outside loop)
            System.out.println("outer loop " + i);
            for (int j = 1; j <= 3; j++) {// inner loop (inside loop)
                System.out.println("Nested loop " + j);
                for (int k = 0; k < 10; k++) {
                    System.out.println("NESTED LOOPS " + k);
                }
            }
        }

    }

}
