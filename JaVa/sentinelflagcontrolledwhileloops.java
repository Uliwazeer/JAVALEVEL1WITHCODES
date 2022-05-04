package javaproject;

import java.util.Scanner;

public class sentinelflagcontrolledwhileloops {
    public static void main(String argus[]) {
        // count controlled while loop
        // flag controlled while loop it is a varible boolean value true or false
        // sentinel controlled while loop when you enter character to making program
        // stop
        // sentinel example
        char letter = 'a';
        int c = 0;
        Scanner in = new Scanner(System.in);
        while (letter != 'q') {
            letter = in.next().charAt(0);
            c++;
        }
        System.out.println("count = " + c); // count=5

        // flag controlled example
        // flag=> itis a hint making while loop play or run when you give it true value
        // and print false when you change flag value to false
        char letter = 'a';
        int c = 0;
        Scanner in = new Scanner(System.in);
        boolean flag = true; // or false;
        while (flag) {
            letter = in.next().charAt(0);
            c++;
            if (letter == 'q')
                flag = false;

        }

        System.out.println("count = " + c); // count=4

        // the difference between sentinel and flag
        // write a programm about marks of students
        Scanner in = new Scanner(System.in);
        float sum = 0;
        float grade = 0;// or grade= 0.0f
        int count = 0;
        while (grade != -1) {
            System.out.println("enter grade # " + (count + 1) + ": ");
            grade = in.nextFloat();
            if (grade != -1) {
                sum += grade;
                count++;
            }

        }

        System.out.println("Avg = " + sum / count); // count=

    }

}
