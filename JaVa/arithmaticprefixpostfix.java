package com.mycompany.firstproject1;

public class arithmaticprefixpostfix {
    public static void main() {
        // BASIC OPERATORS ARITHEMATIC OPERATORS
        // ++ COME OVER WITH +1
        // -- COME DOMDOWN WITH -1
        int x = 1;
        x++; // it is called POSTFIX OR POST INCREMENT
        ++x; // it is called prefix OR pre increment
        System.out.println("x =" + ++x);
        // Notice ++x; = EQUAL x++; in all cases except one case

        // one case
        int x = 5;
        System.out.println("x=" + ++x); // print =>x=6

        int x = 5;
        System.out.println("x=" + x++); // print =>x=5
        System.out.println("New X=" + x); // print =>x=6

        // another example
        int x = 1;
        System.out.println("x=" + x++ + " " + ++x + " " + x++); // print x=1 3 3
        System.out.println("final x=" + x); // print x=4

        // anthor example
        int x = 1, y;
        y = x++;
        System.out.println("y=" + y);// print y=1
        System.out.println("x=" + x);// print x=2

        // anthor example
        int x = 1, y;
        y = ++x;
        System.out.println("y=" + y);// print
        System.out.println("x=" + x);// print

        // anthor example
        int x = 1, y;
        y = x++ + x++;
        System.out.println("y=" + y);// print y=4
        System.out.println("x=" + x);// print x=3

        // Asignment operators
        //= += -= *= /= %= &= ^= |= <<= >== >>>= we will deal with the five first operators becase they using more than others
        int k=5;
        k=k+10; // OR K+=10;
        System.out.println("k = "+k);
         
        //other example 
        int k=5;,y=2; z=9;
        z+=k-y; //OR Z=Z+K-Y
        System.out.println("k = "+z); // print z=6
    }

}
