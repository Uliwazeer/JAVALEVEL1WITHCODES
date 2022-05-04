package com.mycompany.firstproject1;

import java.util.Scanner;

public class selectionconditionalternaryinstanceof {
    public static void main(String args[]) {
        /*
        Write a java programm to calculate grade of students
        if percentage >=90 print A grade
        if percentage >=80 print B grade
        if percentage >=70 print C grade
        if percentage >=60 print D grade
        otherwise print fail
        */

        //control flow statements (selection statement)
        int mark;
        Scanner in =new Scanner (System.in);
        System.out.println("enter your mark");
        mark=in.nextInt();
        /*
        and &&
        true and true and true = true
        true and false = false
        false and true = false
        false and false = false

        or||
        true or true = true
        true or false = true
        false or true = true
        false or false = false
        false or false or true = true
        */
         

      //without using ternary 
        if(mark>=90 && mark<=100 //logical operator or conditional oprator)
            System.out.println("A");
       else if(mark>=80 && mark<90)
            System.out.println("B");
       else if(mark>=70 && mark<80)
            System.out.println("C");
       else if(mark>=60 && mark<70)
            System.out.println("D");
       else
            System.out.println("Fail");

        //we can use ternary condition
        String r=(mark>=90 && mark<=100)?"A":(mark>=80 && mark<90)?"B":(mark>=70 && mark<80)?"C":(mark>=60 && mark<70)?"D":"Please Enter A Valid Mark";
        System.out.println(r);


        
       // other example
       // to make varible store in limit value
       boolean x=(5>4) || (10<5*5);
            System.out.println(x);

       //Ternary Operator or Shorthand if else statement or shortest if else =>?:
       //code without ternary operator condition
       int y=1;
       int z;
       if(y==1)
          z=2;
        else 
        z=5;
        System.out.println("z = "+);
        //code with using ternary operator condition
        int y=1;
        int z= y==1? 2 : 5;
           System.out.println("z = "+z);// z=2


    //comparison which called instanceof to check about type of variable
    //is r string=> answer true or false
    System.out.println(r instanceof string); 
    //is r integer=> answer true or false
    System.out.println(r instanceof int);
    //any object in java languague we called it name =>instance
    //how to check on type of scanner is defined or no ?
    Scanner in =new Scanner(System.in);
      System.out.println(in instanceof Scanner);
    //we can not use this check on datatype int float......


        
    }

}
