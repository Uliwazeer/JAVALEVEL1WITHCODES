package javaProject;

public class PassingArraysToMethods {
    // ex1
    static void print(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);

        }
    }

    // ex2 method can do return for array
    static void print(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);

        }
    }

    static int[] getArray() {
        int ar[] = { 4, 5, 6 };
        return ar;
    }

    // ex4
    static void setArray(int[] x) {
        x[0] = 50;
    }

    // ex5
    static void setVar(int x) {
        x = 10;
    }

    public static void main(String[] args) {
        // arrays one dimensional
        // passing arrays to methods
        // ex1
        int arr[] = { 1, 2, 3, 4 };
        int arr2[] = { 5, 8, 0, 9 };
        // using anonymous array int x[] = new int[]{1,2,3};
        // print(new int[]{1,2,3});
        print(arr2);
        print(arr);
        // ex2
        System.out.println(getArray());// will print the addres of array
        // to print number
        int arr[] = getArray();
        System.out.println(arr[0]);
        // ex3 using func call by referance(meaning two varabiles or more hava a space
        // in memory)
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 40, 50, 60 };
        arr1 = arr2;
        arr2[0] = 100;
        arr1[0] = 500;
        System.out.println(arr2[0]);
        // ex4
        int arr1[] = { 1, 2, 3 };
        setArray(arr1);
        System.out.println(arr[0]);
        // ex5
        int y = 5;
        setArray(y);
        System.out.println(y);
        // ex6 call by value
        int arr1[] = { 10, 20, 30 };
        int arr2[] = { 100, 200, 300 };
        int arr3[] = { 1000, 2000, 3000 };
        arr1 = arr2 = arr3;
        arr[0] = 0;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);

    }

}
