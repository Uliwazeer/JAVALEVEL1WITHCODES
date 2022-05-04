package javaproject;

import java.util.Scanner;

public class branchingstatementbreakcontinue {
    public static void main(String argus[]) {
        /*
         * branching statement
         * the break statement : causes immediate exist from control structure note
         * break statement is two type 1)unlevel break or break statement 2)level break
         * or level contain
         * the continue statement : causes skips remaining statement in loop body
         */
        // we will talk about unlevel break statement
        for (int i = 0; i < 10; i++) {
            if (i == 4)
                break; // print from 1 to 4
            System.out.println("i = " + i);
        }
        System.out.println("ulo wazier");

        // other ex
        for (int i = 0; i < 10; i++) {
            if (i == 4)
                continue; // print from 1 to 10 skipping number 4
            System.out.println("i = " + i);
        }
        System.out.println("ulo wazier");
        // continue making one iteration skipping
        // break making loop stopped in one value
        // other ex
        for (int i = 0; i < 10; i++) {
            if (i <= 4)
                continue; // print from 5 to 10 skipping number 4
            System.out.println("i = " + i);
        }
        System.out.println("ulo wazier");
        // other ex
        for (int i = 0; i < 10; i++) {
            if (i == 4)
                break; // print ulo wazier only because it break loop and print string outside body of
                       // loop
            System.out.println("i = " + i);
        }
        System.out.println("ulo wazier");
        // other ex
        Scanner in = new Scanner(System.in);
        System.out.println("Test Yourself :");
        System.out.println("what is '5+10/2*10= ?'");
        float userAnswer, theCorrectAnswer = 55;
        boolean questionAnswer = false;
        for (int i = 1; i <= 3; i++) {
            userAnswer = in.nextFloat();
            if (userAnswer == theCorrectAnswer) {
                questionAnswer = true;
                break;

            } else if (userAnswer != theCorrectAnswer) {
                System.out.println("chance #" + (i + 1) + " : ");
                continue;
            }

        }
        if (questionAnswer)
            System.out.println("correct answer");
        else
            System.out.println("wrong answer");

    }

}
