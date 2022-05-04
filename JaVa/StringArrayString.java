package javaProject;

public class StringArrayString {
    public static void main(String[] args) {
        // java strings class
        // ex1
        // we can do initialization with two types
        // 1)using double qoutation
        String str = "ABCDE";
        System.out.println(str);
        // ex2 initialization 2)using keyword new
        String str = new String("ABCDE");
        System.out.println(str);
        // ex3
        String str = "HELLO";
        str = str.concat(",I'M Uli Wazeer");
        System.out.println(str);
        // ex4
        String str = "HELLO";
        str = str + ",I'M Uli Wazeer";
        System.out.println(str);
        // ex5
        String str1 = "hello";
        String str2 = "hiy";
        System.out.println(str1);
        System.out.println(str2);
        // when instance or varible or object have same value(called string constant
        // pool) and have same place stored in memory
        // ex6
        String s1 = "abcd";
        String s2 = "ABCD";
        System.out.println((int) 'A');
        System.out.println(s1.compareTo(s2));
        // ex7
        String str = "   HELLO   ";
        System.out.println(str1 + "HOW ARE YOU");
        System.out.println(str1.trim() + "HOW ARE YOU");
        // ex8
        String str1 = "hello I'AM ULI WAzeer";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        // ex9
        int n = 20;
        String str1 = String.valueOf(n);
        System.out.println(str1);
        // ex9 answer with anther way
        int n = 20;
        String str1 = n + ""; // casting for varible from integer to string
        System.out.println(str1);
        // ex10 comparison
        String s1 = "HELLO";
        String s2 = "HELLO";
        System.out.println(s1 == s2);
        // ex11 comparison
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        System.out.println(s1 == s2);// print false because address is different from others

        // ex12 comparison
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        System.out.println(s1.equals(s2)); // func equals is foucusing on value only
        // ex13 comparison
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        System.out.println(s1.equals("HELLO")); // func equals is foucusing on value only
        // ex14 comparison
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        System.out.println(s1 == ("HELLO")); // False because printing adderes
        // ex15 comparison
        String s1 = "HELLO";
        String s2 = "HELLO";
        System.out.println(s1.equalsIgnoreCase(s2));
        // ex16 replace
        String s1 = "Hey Welcome TO c++ Course";
        String replaceString = s1.replace("c++", "java");
        System.out.println(replaceString);
        // ex17 contain
        String name = "hello how are you doing";
        System.out.println(name.contains("how are you"));
        System.out.println(name.contains("hello"));
        System.out.println(name.contains("fine"));
        // ex18 endswith
        String s1 = "hello how are you";
        System.out.println(s1.endsWith("u"));
        System.out.println(s1.endsWith("you"));
        System.out.println(s1.endsWith("how"));
        // ex19 startswith
        String s1 = "hello how are you";
        System.out.println(s1.startsWith("u"));
        System.out.println(s1.startsWith("you"));
        System.out.println(s1.startsWith("how"));
        // ex20
        String s1 = "hello";
        System.out.println(s1.substring(2));
        // ex21
        String str = "AA-BB-CC-DD-EE-FF";
        for (String val : str.split("-")) {
            System.out.println(val);
            // ex22
            String str[] = { "AA", "BB" };
            System.out.println(str[0]);
            // ex23
            String str[] = { "AA", "BB" };
            for (int i = 0; i < str.length; i++) {
                System.out.println(str[i]);
            }

        }
    }

}
