package org.example.randomExercises.longestCommonPrefix;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    //Write a function to find the longest common prefix string amongst an array of strings.
    //
    //If there is no common prefix, return an empty string "".

    //Input: strs = ["flower","flow","flight"]
    //Output: "fl"
    public static void main(String[] args) {


        String[] arr = {"a","a","b"};

        String prefix = longestCommonPrefix(arr);
        System.out.println(prefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
