package com.dh.model;

public class Palindrome {
    public static boolean palindromeChecker(String input){
        boolean isPalindrome = true;
        for (int i = 0 ; i <=input.length()-1 ; i ++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.println("result " + palindromeChecker("aLmLa"));
    }
}
