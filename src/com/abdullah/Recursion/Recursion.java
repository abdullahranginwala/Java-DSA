package com.abdullah;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    static int fibonacci(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    //Find if the array is sorted using recursion

}
