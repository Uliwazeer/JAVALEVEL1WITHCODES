package javaproject;

public class whileloop {
    public static void main(String args[]) {
        //TYPE TWO OF CONTROL FLOW STATEMENT REPETITION CONTROL STATEMENT
        //WHILE LOOP using repeat statemment instead of many print on lines
        while ( true//we write a boolean expression true or false) {
            System.out.println("Uli Wazeer"); //will print a infinite loop which make browser cashing
            
        }

    // other example
    int count=1;while(count<=5)
    {
        System.out.println("Uli Wazeer");// will print an infiniti loop
    }
    // other example to stop infintiy loop we use ++count;
    int count = 1;while(count<=5)
    {
        System.out.println("Uli Wazeer");// will print an infiniti loop
        ++count; // print 5 times
    }System.out.println("count = "+count); // count =6
    // while loop contain 3 oprations
    // 1-count=initial value=> int count=1;
    // 2-condition in while statement=>count<=5
    // 3-increment on count=> ++count;

    // how can abreviation value of increament inside while loop until prefix or
    // postfix
    int count2 = 5;while(count2++<=10)
    {
        System.out.println("Uli Wazeer" + count2);
    }

}
