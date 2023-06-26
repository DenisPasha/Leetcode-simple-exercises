package org.example.leetCode75Exercises.diffInTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    //Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
    // Bad complexity time
    // todo refactor to get better performance
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,3};
        int[] arr2 = {1,1,2,2};

        List<List<Integer>> difference = findDifference(arr1, arr2);
        System.out.println();
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> toReturn = new ArrayList<>();

        getNonContaining(nums1, nums2, list1);
        getNonContaining(nums2, nums1, list2);

        toReturn.add(list1);
        toReturn.add(list2);
        return toReturn;
    }

    private static void getNonContaining(int[] nums1, int[] nums2, List<Integer> list1) {
        for (int i = 0; i < nums1.length; i++) {
            boolean contains = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    contains = true;
                    break;
                }
            }
            if (!contains){
                if (!list1.contains(nums1[i])){
                    list1.add(nums1[i]);
                }
            }
        }
    }
}
