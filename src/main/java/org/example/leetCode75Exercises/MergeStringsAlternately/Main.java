package org.example.leetCode75Exercises.MergeStringsAlternately;

public class Main {
    public static void main(String[] args) {
        String merged = mergeAlternately("abc", "pqr");

        System.out.println(merged);
    }

    public static String mergeAlternately(String word1, String word2) {

        String merged = "";

        int i = 0;
        int k = 0;

        while (i < word1.length() && k < word2.length()){
            merged = merged + word1.charAt(i);
            merged = merged + word2.charAt(k);
            i++;
            k++;
        }

        while (i < word1.length()){
            merged = merged + word1.charAt(i);
            i++;
        }

        while (k < word2.length()){
            merged = merged + word2.charAt(k);
            k++;
        }
        return merged;
    }
}
