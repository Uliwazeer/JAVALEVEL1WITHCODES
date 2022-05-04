package javaProject;

public class RecursionRecursiveMethodsPart1 {
    // will happen infinti loop or stackoverflow in memory
    // to making stopping in loop we use if statement or switch statement
    /*
     * there are two types of recurisons 1)Direct recurison which we talk about in
     * this exampls
     * 2)indirect recursion
     */
    static void fun() {
        System.out.println("Uli");
        fun();
    }

    // ex2
    static int count = 0;

    static void fun() {
        count++;// if you removd it from its place and put in outside if statement will happend
                // infinity loop
        if (count < 5) {// base case is a condition or statement which limit you when method stopping
            System.out.println("Uli");
            fun();
        }
    }

    // ex3
    static int count = 0;

    static void fun() {
        if (count == 5) {// base case is a condition or statement which limit you when method stopping
            return;
        }
        count++;
        System.out.println("Uli");
        fun();
    }

    // ex4
    static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }

    // ex5
    static void fun(int n) {
        if (n < 1)// base case => smallest number from factorial
            return;
        else
            System.out.println("# " + n);
        fun(n - 1);
    }

    public static void main(String[] args) {
        /*
         * Recursion in java is a process in which a method calls itself continously
         * a method in java that calls itself is called recrussive method
         */
        fun();
        // ex2
        fun();
        // ex3
        fun();
        // ex4
        System.out.println("fact = " + fact(5));
        // ex5
        fun(8);
    }
    /*
     * DIRECT RECURSION SYNTAX
     * static void directRecFun(){
     * //Some Code
     * directRecFun()
     * // Some Code
     * }
     */

     /*
     * INDIRECT RECURSION SYNTAX
     * static void indirectRecFun1(){
     * //Some Code
     * indirectRecFun2() يعني عادي في دالة مستدعية دالة تاني
     * // Some Code
     * }
     * static void indirectRecFun2(){
     * //Some Code
     * indirectRecFun1() يعني عادي في دالة مستدعية دالة تاني
     * // Some Code
     * }
     */

}
