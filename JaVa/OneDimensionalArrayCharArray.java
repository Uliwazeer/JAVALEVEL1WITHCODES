package javaProject;

public class OneDimensionalArrayCharArray {
    public static void main(String[] args) {
        // array one dimensional arrays
        // char array
        // ex1
        char arr[] = new char[5];
        arr[0] = 'H';
        arr[1] = 'E';
        arr[2] = 'L';
        arr[3] = 'L';
        arr[4] = 'O';
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        // ex2 same perivious example but another way
        char arr[] = new char[5];
        arr[0] = 'H';
        arr[1] = 'E';
        arr[2] = 'L';
        arr[3] = 'L';
        arr[4] = 'O';
        System.out.println(arr);
        // ex3
        char arr[] = { 'U', 'L', 'I' };
        System.out.println(arr);
        // ex4 using numeric number transfer to characters
        char arr[] = { 258, 15, 589, 145 };
        System.out.println(arr);
        // ex5
        char ch = 66;
        System.out.println(66);// or using casting way=> System.out.println((char)66);

    }

}
