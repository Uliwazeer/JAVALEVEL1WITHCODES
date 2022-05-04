
package com.mycompany.firstproject;

public class arithmeticoperation {

    public static void main(String args[]) {
             //BASIC OPERATION
             //ARITHEMTIC OPERATORS
             //REATIONAL OPERATORS
             //Bitwise,Logical,Assignment Operators
             //Miscellaneous Operators
             // in this video we talk about arithematic operator
             //such as - + * / %
             int x=10;
             System.out.println("x = "+x);


             int x=10+78-69*87+58-54*5/54;
             System.out.println(x);

             int x=10+78-69*87+58-54*5/54;
             System.out.println(10+78-69*87+58-54*5/54);


             int x=10+78-69%87+58-54*5/54;
             System.out.println(10+78-69*87+58-54*5/54);


             int x=10+78-69*87%58-54*5/54;
             System.out.println(10+78-69*87+58-54*5/54);
             //if you make some operation mix of datatypes the proprity will the biggest value
             /*
             byte int = int
             byte short = short
             int float = float
             float double = double
             int float short double = double
             */
            System.out.println(15/2); // print int 
            System.out.println(15.0/2); // print float
            
            int x=9, y=2;
            System.out.println(x/y); //will print int

            int x=9;
            float  y=2;
            System.out.println(x/y); //will print float
            // after that we find anew of data type called TYPE CASTING
            int x=9;,y=2;
            System.out.println((float)x/y);


            //an operation which hold out from big datatype to small datatype called (Widening Primitive Conversions OR Widening Primitive Casting)
            //an operation which hold out from small datatype to big datatype called (Narrowing Primitive Conversions)
            float x=9, y=2;
            System.out.println((int)x/y);

    
}
