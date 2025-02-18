package com.dh.model;


public class Fibonaci {

    public static int fibonacciRecursive(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static int fibonacciIterative(int n){
        if (n <= 1) {
            return n;
        }
        int prev = 0, current = 1;
        for (int i = 2; i<=n;i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }


    public static void main (String [] args){
        int resultRe = fibonacciRecursive(6);
        int resultIt = fibonacciIterative(6);
        System.out.println("resultRe "+resultRe);
        System.out.println("resultIt "+resultIt);

    }
}