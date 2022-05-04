package javaProject;

import java.util.Arrays;

public class OneDimensionalArrayExercisesPractice {
    public static void main(String[] args) {
        /*
         * array one-dimensional array
         * practise and exercises
         */
        // write a program to sum values of an array
        int arr[] = { 1, 2, 3, 4, 5, 9 };
        int sum = 0;
        for (int i = 0; i < arr.lenght; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
        // ex write a programm to calculate average value of array elements
        int arr[] = { 1, 2, 3, 4, 5, 9 };
        int sum = 0;
        for (int i = 0; i < arr.lenght; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        System.out.println("Avg = " + avg);
        // ex write a program to test if an array contains a specific value
        int arr[] = { 5, 2, 6, 8 };
        int num = 2;// we change in this value to print found or not found
        boolean f = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                f = true;
                break;
            }
        }
        if (f) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
        // ex write a program to find the max and min value of array
        int arr[] = { 5, 2, 6, -8, 0, 10 };
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        //ex write a program to sort a numeric array
        int arr[] = {9,8,1,25,0,-1};
        Arrays.sort(arr);
        for(int i= 0; i<arr.length;i++){
            System.out.println(arr[]+" ");
        }

    }

}
