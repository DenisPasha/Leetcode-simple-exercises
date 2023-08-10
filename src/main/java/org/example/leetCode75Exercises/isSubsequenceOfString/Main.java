package org.example.leetCode75Exercises.isSubsequenceOfString;

public class Main {

    //Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
    //
    //A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
    // of the characters without disturbing the relative positions of the remaining characters.
    // (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
    public static void main(String[] args) {
        boolean subsequence = isSubsequence("gac", "ahbgdc");
        System.out.println(subsequence);
    }
    public static boolean isSubsequence(String s, String t) {

        StringBuilder sequence = new StringBuilder();
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));

            for (int j = k; j < t.length(); j++) {
                k++;
                String mainWordCurrentChar = String.valueOf(t.charAt(j));
                if (currentChar.equals(mainWordCurrentChar)){
                    sequence.append(currentChar);
                    break;
                }
            }
        }


        if (sequence.toString().equals(s)){
            return true;
        }else {
            return false;
        }
    }
}
