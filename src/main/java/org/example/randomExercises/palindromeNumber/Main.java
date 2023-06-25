package org.example.randomExercises.palindromeNumber;

public class Main {
    public static void main(String[] args) {
        isPalindrome(101);

    }

    public static void isPalindrome(int x) {
        String number = String.valueOf(x);

        int length = number.length();

        String temp = "";
        for (int i = length - 1; i >= 0 ; i--) {
            temp = temp + number.charAt(i);
        }

    }
}
