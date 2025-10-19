package com.example.lambda;

import com.example.GreetingService;
import com.example.SingleGreetingService;

/**
 * Demonstrates usage of lambda expressions and anonymous classes with GreetingService.
 */
public class BasicLambda {
    /**
     * Entry point for demonstrating lambda expressions and anonymous classes.
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        GreetingService greetService = new GreetingService() {
            @Override
            public void greet(String fname,String lname, int age) {
                System.out.println("Hello " + fname + ", lname" + lname + ", Age: " + age);
            }
        };
        greetService.greet("Sudhakar", "VE",30);

        GreetingService gs = (fname,lname, age) -> System.out.println("Hello " + fname + ", lname:"+lname + "Age, " + age);
        gs.greet("Sudhakar Lambda", "VE",31);

        GreetingService gs1 = (fname, lname,age) -> {
            System.out.println("Hello " + fname + " " + lname+ ", Age: " + age);
            System.out.println("This is multi line lambda");
        };
        gs1.greet("Sudhakar ", "VE",50);

        SingleGreetingService SGS = (n) -> n.toUpperCase();

        System.out.println(SGS.Wish("Hello Sudhakar"));
    }

    /**
     * Calculates and prints the count of duplicate characters in the given string.
     * @param str the input string to check for duplicate characters
     */
    void getDuplicateCount(String str) {
        str = str.toLowerCase();
        int count = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("The number of duplicate characters in the given string: " + count);
    }
}
