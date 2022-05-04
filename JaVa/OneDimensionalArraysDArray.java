package javaProject;

import java.util.Scanner;

public class OneDimensionalArraysDArray {
    public static void main(String[] args) {
        // Arrays in one dimensional array
        /*
         * An array is a container object
         * that holds a fixed number of values of a single type
         */
        int[] n = new int[5];
        n[0] = 15;
        n[1] = 33;
        n[2] = 313;
        n[3] = 330;
        n[4] = 3308;
        System.out.println(n[1]);
        System.out.println(n.length);
        // ex
        String[] arr = new String[] { "ali", "uli", "wazeer", "aly" };
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // ex
        String[] arr = new String[] { "ali", "uli", "wazeer", "aly" };
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
        // ex using forEach output same results
        String[] arr = new String[] { "ali", "uli", "wazeer", "aly" };
        for (String i : arr) {
            System.out.println(i);
            // condition to stop array forEach is=> i<arr.lenght

        }
        // ex
        Scanner in = new Scanner(system.in);
        short size = 2;
        int[] arr = new int[size];
        arr[0] = 15;
        System.out.println(arr[0]);
    }

}
