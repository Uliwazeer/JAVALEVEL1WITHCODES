package javaproject;

import java.util.Scanner;

public class finaltyperepetitioncontrolstatementforloop {
    public static void main(String argus[]) {
        //repetition control statement
        //3)For Loop should have two semicolon and conditional statement
        int c=0;
        for(;c>5;){

        System.out.println(c);
        c++; //print 0 1 2 3 4 
        }
        // programmers like for loop about any statement loop becuse for loop can
        // concatenate initial value with increment in one sentance
        //ex
        for(int c=0;c<5;c++//increment with initial value){
            System.out.println(c);
        }
    // another ex
    for(

    int c = 0;++c<5;// increment with initial value){
    System.out.println(c); // print 0 1 2 3 4
    }
    // ex
    for(
    int c = 0;c<5;c++// increment concatenate with initial value){
    System.out.println(c);}System.out.println("c = "+c);// print error because counter dont find counter called c
                                                        // because it is found in for statement(inside this loop) shoud
                                                        // outside for loop to reach it
    // ex
    // ex
int c; // we identify counter outside for loop to make you reach it
    for(
    int c = 0;c<5;c++// increment with initial value){
    System.out.println(c);}System.out.println("c = "+c);// not fond any error in programm and will print 0 1 2 3 4
int c; // we identify counter outside for loop to make you reach it
    for(
    int c = 0;++c<5;// increment with initial value){
    System.out.println(c);// print 1 2 3 4
    }System.out.println("c = "+c);// print c = 5
    // ex other
int f;for(c=2;c<10;c+=2)System.out.println(c);// 2 4 6 8
    System.out.println(c);// print 10
    // we can concatenate more condition in same loop
    for(
    int i = 0, j = 0;i<10&&j<5;i++,j++){System.out.println("i = "+i+"\t"+"j = "+j);}
    // ex on concatenate more condition in same loop
    for(
    int i = 0, j = 5;i<8&j>=0;i++,j--){System.out.println("i = "+i+"\t"+"j = "+j);}

    // ex on concatenate more condition in same loop
    for(
    int i = 0, j = 5;i<8|j>=0;i++,j--){System.out.println("i = "+i+"\t"+"j = "+j);}
    // ex on concatenate more condition in same loop
    for(
    int i = 0, j = 5;i<8||j>=0;i++,j--){System.out.println("i = "+i+"\t"+"j = "+j);}
    // ex on concatenate more condition in same loop
    for(
    int i = 0, j = 5, h = 0, k = 0;i<8|j>=0;i++,j--){System.out.println("i = "+i+"\t"+"j = "+j);
}}

}
