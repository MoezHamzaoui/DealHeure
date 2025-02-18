package com.dh.model;

public class ChessTournament {

    public static int numberOfCouple(int n){
        if (n < 2) {
            return 0;
        }
        return  n * (n-1)/2;
    }

    public static void main (String [] args) {
        System.out.println("Result "+numberOfCouple(7));
    }

}
