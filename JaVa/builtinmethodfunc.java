package javaproject;

//import static java.lang.Math.abs; // 1 =>one type
//import static java.lang.Math.ceil; // 1 =>one type
//we can call function using math.abs(-1.5)
//we can call function using math.ceil(-1.5)
import static java.lang.Math.*; //we call all functions 

public class builtinmethodfunc {
    public static void main(String[] args) {
        // Built in function Method its a exist functions in language you can use it
        /*
         * WE WILL TALK ABOUT JAVA NUMBER METHODS (MATH)
         * 
         * java number methods
         * java string methods
         * java character methods
         * java array methods
         * //should call function
         */
        /*
         * 1 * static double abs(double a)
         * 2* static float abs(float a)
         * 3* static int abs(int a)
         * 4* static long abs(long a)
         * 5* static double ceil(double a)
         * 6* static double floor(double a)
         * 7* static long round(double a)
         * 8* static double sqrt(double a)
         * 9* static double cos(double a)
         * 10* static double exp(double a)
         * 11* static double log(double a)
         * 12* static double log10(double a)
         * 13* static double pow(double a, double b)
         * 14* static double random() greater than or equal to 0.0 and less than 1.0()
         * 15* static double max(double a, double b)
         * 16* static float max(float a, float b)
         * 17* static int max(int a, int b)
         * 18* static long max(long a, long b)
         * 19* static double min(double a, double b)
         * 20* static float min(float a, float b)
         * 21* static int min(double a, double b)
         * 22* static long min(long a, long b)
         */
        // type number 1 => * 1 * static double abs(double a)
        System.out.println("abs = " + abs(-1.1));

        // type number 1 =>* 5* static double ceil(double a)
        System.out.println("ceil = " + ceil(-1.5));
        // type number 6 => * 6* static double floor(double a)
        System.out.println("floor = " + floor(-1.5));
        // type number 6 => * 7* static long round(double a)
        System.out.println("round = " + round(-1.5));
        // type number 7 =>* 8* static double sqrt(double a)
        System.out.println("sqrt = " + sqrt(9));
        // type number 13 => * 13* static double pow(double a, double b)
        System.out.println("pow = " + pow(2, 9));
        // type number 14 => * 14* static double random() greater than or equal to 0.0
        // and less than 1.0()
        // (random()*(max-min)+1))+min;
        double r = (random() * ((10 - 1) + 1)) + 1;
        System.out.println("random = " + r);
        // type number 14 => * 14* static double random() greater than or equal to 0.0
        // and less than 1.0()
        // (random()*(max-min)+1))+min;
        int r = (int) (random() * ((10 - 1) + 1)) + 1;// casting to store in integer not random function
        System.out.println("random = " + r);
        // type number 15 =>* 15* static double max(double a, double b)
        System.out.println("max = " + max(22, 589));

    }

}
