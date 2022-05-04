package javaproject;

//ex1
static int fib(int n){if(n==0||n==1)return n;else return fib(n-1)+fib(n-2);}
//ex2
static int n1=0,n2=1,n3;static void printFib(int n){if(n>0){n3=n1+n2;n1=n2;n2=n3;System.out.println(" "+n3);printFib(n-1);}}
//ex3
static int sum(int n1,int n2){if(n1==n2)return n1;else return n1+sum(n1+1,n2);}
//ex4
static int sum(int n1,int n2){if(n1==n2)return n1;else{if(n1<n2)return n1+sum(n1+1,n2);else return n1+sum(n1-1,n2);}
public class RecursionRecursiveMethodsPart2 {
    public static void main(String[] args) {
        // recursion methods part2=>0 1 2 3 4 5 6 7 8 9 10 <=Output
        // fibonacci =fib()series=> 0 1 1 2 3 5 8 13 21 34 55.....etc <=input
        /*
        fib()=>is base case1 + base case2 =sum of 1+2
        */
        //ex1
        System.out.println("fib = "+fib(7));
        //ex2
        System.out.println(n1+" "+n2);
        int num=5;
        printFib(num-2);
        //ex3
        //write a program print numbers from range=>1...5=1+2+3+4+5=15
        System.out.println("sum = "+sum(1,5));
        //ex4 is other answer for ex3
        //sum =(upper-lower+1)*(lower+upper)/2;
        //other answer for ex3 will print numbers from big num to small num with adding some conditon
        System.out.println("sum = "+sum(5,1));

    }

}
