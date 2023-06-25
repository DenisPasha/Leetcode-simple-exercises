package org.example.leetCode75Exercises.reverseAStringWords;

public class Main {

    //Given an input string s, reverse the order of the words.
    //
    //A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
    //
    //Return a string of the words in reverse order concatenated by a single space.
    //
    //Note that s may contain leading or trailing spaces or multiple spaces betwe
    public static void main(String[] args) {
        String reversed = reverseWords("a good   example");
        System.out.println(reversed);
    }

    public static String reverseWords(String text) {

        String trimmed = text.trim();
        String[] separated = trimmed.split("[\\s]++");

        String reversed = "";
        for (int i = separated.length - 1; i >= 0 ; i--) {
            reversed+=separated[i];
            reversed+=" ";
        }

        return reversed.trim();

    }
}
