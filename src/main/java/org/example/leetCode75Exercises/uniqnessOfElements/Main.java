package org.example.leetCode75Exercises.uniqnessOfElements;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    //Given an array of integers arr,
    // return true if the number of occurrences of each value in the array is unique or false otherwise.

    public static void main(String[] args) {

        int[] arr = {1,2};
        boolean result = uniqueOccurrences(arr);
        System.out.println(result);



    }

    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.putIfAbsent(arr[i] , 0);
            Integer count = map.get(arr[i]) + 1;
            map.put(arr[i] , count);
        }


        Set<Integer> set = new HashSet<>();
        set.addAll(map.values());
        if (map.values().size() == set.size()){
            return true;
        }
        return false;
    }
}
