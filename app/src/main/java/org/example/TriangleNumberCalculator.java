package org.example;

public class TriangleNumberCalculator {

    // Recursive method to compute the nth triangular number
    public int value(int n) {
        if (n <= 1) {
            return n;
        }
        return n + value(n - 1);
    }

    // Add the nth and mth triangular numbers
    public int add(int n, int m) {
        return value(n) + value(m);
    }

    // Subtract the mth triangular number from the nth
    public int subtract(int n, int m) {
        return value(n) - value(m);
    }
}