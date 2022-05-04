package javaProject;

public class funcmethodpartone {
    // video18 important
    // functions can be written over func main using static or under func main
    // ex1
    static void print
    {
        System.out.println("ali1");
        System.out.println("ali2");
        System.out.println("ali3");
        System.out.println("ali4");
        System.out.println("ali5");
        System.out.println("ali6");
        System.out.println("ali7");
        System.out.println("ali8");
        System.out.println("ali9");
        System.out.println("ali10");
    }

    // ex2
    // return value type any data type
    static void fun() {// prototype for function
        System.out.println("ali1");
        System.out.println("ali2");
        System.out.println("ali3");
        System.out.println("ali4");
        System.out.println("ali5");
        System.out.println("ali6");
        System.out.println("ali7");
        System.out.println("ali8");
        System.out.println("ali9");
        System.out.println("ali10");

    }

    // ex4 to calculate two numbers
    static int sumTwoNumbers(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    // ex6
    static void sumTwoNumbers(int n1, int n2) {
        if (n1 == 0 && n2 == 0)
            return;
        System.out.println("sum = " + (n1 + n2));
    }

    public static void main(String[] args) {
        // methods or operation or function
        // ex1
        {
            print();
        }
        // ex2
        {
            fun();
        }
        // ex3
        {
            int n1, n2;
            n1 = 10;
            n2 = 5;
            int sum = n1 + n2;
            System.out.println("sum = " + sum);
        }
        // ex4
        {
            System.out.println(sumTwoNumbers(5, 10));
            System.out.println(sumTwoNumbers(105, 105));
        }
        // ex5
        {
            int s = sumTwoNumbers(8, 12);
            s += 4;
            System.out.println("s = " + s);
        }
        // ex6
        {
            sumTwoNumbers(1, 8);
        }
        // methods=> is any function inside the class if not called function
        // in java every line always class with declaration

    }

}
