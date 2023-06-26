package org.example.randomExercises.removeElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
    //
    //Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
    //
    //Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
    //Return k.
    public static void main(String[] args) {

        int[] arr = {3,2,2,3};
        int val = 3;
        int i = removeElement(arr, val);
        System.out.println(i);
    }


    public static int removeElement(int[] nums, int val) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                list.add(nums[i]);
            }
        }


        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        int k = list.size();

        return k;
    }
}
