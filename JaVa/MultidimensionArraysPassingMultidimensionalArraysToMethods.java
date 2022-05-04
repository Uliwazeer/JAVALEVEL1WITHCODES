package javaProject;

public class MultidimensionArraysPassingMultidimensionalArraysToMethods {
    // ex6
    static void print(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j] + " ");

            }
            System.out.println();

        }

    }

    // ex7 method to making return two dimensional array and store two dimensional
    // array
    static int[][] get2dArray() {
        int ar[][] = new int[2][3];
        return ar;
    }

    public static void main(String args[]) {
        // arrays two dimensional [rows,column]
        // int arr[][] = new int[5][1]; // or []arr[]=new int[5][1]; or [][]arr=new
        // int[5][1];
        int[][] arr = new int[3][];
        // declaration //we can do declaration with anthor way 3rows and 4columns=>int
        // [][]arr= new int[3][4];
        /*
         * we can do initialization with anthor way
         * int [][]arr=new int[][]{
         * {1,5,8},//store in three column
         * {5,5},//store in two column
         * {7}// store in one column
         * }
         * 
         */
        /*
         * we can do initialization with anthor way
         * int [][]arr={
         * {1,5,8},//store in three column
         * {5,5},//store in two column
         * {7}// store in one column
         * //to know how many rows
         * System.out.println(arr.length);
         * to print elements in row2 using index
         * System.out.println(arr[1].length);
         * }
         * 
         */

        arr[0] = new int[4];
        arr[1] = new int[4];
        arr[2] = new int[4];
        // initialization for rows1
        arr[0][0] = 55;
        arr[0][0] = 5005;
        arr[0][0] = 5500;
        arr[0][0] = 550;

        // initialization for rows2
        arr[1][0] = 555;
        arr[1][0] = 50505;
        arr[1][0] = 55050;
        arr[1][0] = 5505;
        // initialization for rows3
        arr[2][0] = 55885;
        arr[2][0] = 5050885;
        arr[2][0] = 5505088;
        arr[2][0] = 550588;
        // ex3
        int[][] arr = {
                { 1, 5, 8 }, // store in three column
                { 5, 5 }, // store in two column
                { 7 } };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.println(arr[row][col] + " ");

            }
            System.out.println();

        }
        // ex4 other answer for ex3
        int[][] arr = {
                { 1, 5, 8 }, // store in three column
                { 5, 5 }, // store in two column
                { 7 } };
        for (int[] r : arr) {
            for (int c : r) {
                System.out.println(c + " ");

            }
            System.out.println();
            // ex5 how to make a transpose for matrix
            int[][] arr = {
                    { 1, 3, 5 },
                    { 2, 4, 6 }, };
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.println(arr[i][j]);

                }

            }
        }
        // ex6 how to make a passing two dimensional array call by referance
        int[][] arr = {
                { 1, 3, 5 },
                { 2, 4, 6 }, };
        print(arr);
        // ex7
        int[][] arr = {
                { 1, 3, 5 },
                { 2, 4, 6 }, };
        print(arr);
    }

}
