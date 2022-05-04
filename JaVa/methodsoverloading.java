package javaProject;

public class methodsoverloading {
    static int sum(int n1, int n2) {
        return n1 + n2;
    }

    static float sum(float n1, float n2) {
        return n1 + n2;
    }

    static float sum(int n1, float n2) {
        return n1 + n2;
    }

    static float sum(long n1, int n2) {
        return n1 + n2;
    }

    // ex how to order a meal from restaurant
    static float order(float total) {
        return total;

    }

    static float order(float total, int deliveryCosts) {

        return total + deliveryCosts;

    }

    static float order(float total, int deliveryCosts, String promo) {

        return total + deliveryCosts - 2;

    }

    // ex
    static void fun() {
        System.out.println("fun ");
    }

    static void fun(int x) {
        fun();
        System.out.println("x = " + x);
    }

    // we can making overloading on function main
    public static void main(int num) {
        System.out.println(num);
    }

    public static void main(String[] average) {
        System.out.println("sum = " + sum(9, 10, 10.5f));
        // Method Overloading
        //any method you can do on it overloading
        /*
         * over loading methods allow different method to have the same name,but
         * different signtures where the signtures
         * can differ by the number of input parameters or type of input parameteres or
         * both
         * overloading is related to compile-time or ststic polymorphism
         */
        //ex how to order a meal from restaurant
        System.out.println(order(15,3,"ihihihg6229");
        //we will call function of fun and give it a value=20
        fun(20);
         //we will call function of fun and give it a value=20500
         main(20500);

    }

}
