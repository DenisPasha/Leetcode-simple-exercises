package org.example.leetCode75Exercises.maxAvgSubArray;

import java.util.*;

public class Main {

    //You are given an integer array nums consisting of n elements, and an integer k.
    //
    //Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
    // Any answer with a calculation error less than 10-5 will be accepted.
    public static void main(String[] args) {

        int [] arr = {1,12,-5,-6,50,3};
        int k = 4;
        double maxAverage = findMaxAverage(arr, k);
        System.out.println(maxAverage);
    }

    public static double findMaxAverage(int[] nums, int k) {

        int possibleArrayCount = (nums.length - k) + 1;
        double max = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < possibleArrayCount; i++) {

            double temp = 0;
            for (int j = i; j < k + i; j++) {
                temp+=nums[j];
            }
            temp = temp / k;
            if (max < temp){
                max = temp;
            }
        }
        return max;
    }

}
