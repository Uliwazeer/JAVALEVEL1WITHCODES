package javaproject;

import java.util.Scanner;

public class quetionsandexercisesinloop {
    public static void main(String argus[]) {
        //write a program to print from 1 to 10
        //using for loop
        for(int i=1; i<=10; i++){
            System.out.println(i);//print 1 to 10
        }
        // using while loop
        int i = 1;
        while ( i <= 10) {
            System.out.println(i);// print 1 to 10
            i++;
        }
        // using Do-while loop
        int i = 1;
       do {
            System.out.println(i);// print 1 to 10
            i++;
        } while (i <= 10);
        //another example 
        //write a program to calculate the sum of 10 floating number using for loop
        Scanner in = new Scanner(System.in);
        float sum=0, num; //or using double instead float
        for(int i=1; i<=10; i++){
            System.out.println("Enter any number: ");
            num=in.nextFloat();
            sum+=num;
        }
        System.out.println("sum = "+sum);
        //write a program that asking you the user to input a positive integer,it should then print the multiplication table of that number
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("enter [positive number: ");
        num=in.nextInt();
        for(int i =1; i<= 10; i++){
            System.out.println(num+"  "+i+" = "+ (num*i));
        }
       //write a program to find the factorial value of any number value entered through the user
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number:");
        int num = in.nextInt();
        int f=1;
        for(int i =num; i>=1;i--){
            f=f*i;
        }
        System.out.println("factorial = "+f);
        //write a program that enters 10 integers number from the user and then prints the sums of the even and odd integers
        Scanner in = new Scanner(System.in);
        int num;
        int sumEven=0;,sumOdd=0;
        int i=0;
        while(i<10){
            System.out.println("Enter Integer Number:");
            sum=in.nextInt();
            if(num%2==0){
                sumEven+=num;
            }
            else
             sumOdd+=num;
             i++;
        }
        System.out.println("Even = "+sumEven);
        System.out.println("odd = "+sumOdd);


        //write a program that enters 10 integers number from the user and then prints the numbers of the even and odd integers
        Scanner in = new Scanner(System.in);
        int num;
        int countEven=0;,countOdd=0;
        int i=0;
        while(i<10){
            System.out.println("Enter Integer Number:");
            sum=in.nextInt();
            if(num%2==0){
                countEven++;
            }
            else
             countOdd++;
             i++;
        }
        System.out.println("Even = "+countEven);
        System.out.println("odd = "+countOdd);
         //write a program to calculate the sum of follwing series where n is input by user
         //like 1+1/2+1/3+1/4+1/5+...........1/n
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();//6
        float sum=0;
        for(int i=1;i<=n;i++){
            sum+=1/i;
        }
        System.out.println("sum = "+sum);

         //write a program to calculate the sum of follwing series where n is input by user
         //like 1+1/2+1/3+1/4+1/5+...........1/n
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();//6
        float sum=0;
        for(int i=1;i<=n;i++){
            sum+=1.0/i; //we can making casting for i or 1 by making 1=1.0 or i=i.0
        }
        System.out.println("sum = "+sum);
        //anthor ex
      Scanner in = new Scanner(System.in);
      float n;
      float sum=0.f;
      for(int i=1; i<=10;i++){
          System.out.println("Enter % "+i+" :");
          n =in.nextInt();
          sum+=n;
      }
      float avg=sum/10;
      System.out.println("Avg = "+avg);


    }

}
