package org.example.leetCode75Exercises.moveZeroesToEnd;

public class Main {

    //Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    //
    //Note that you must do this in-place without making a copy of the array.
    public static void main(String[] args) {

        int[] arr = {1,0};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums) {
        System.out.println();
        int p1 = 0;
        int p2 = p1 + 1;

        while (p2 < nums.length){
            if (nums[p1] == 0){
                if (nums[p2]!=0){
                    swap(nums , p1,p2);
                    p1++;
                    p2++;
                }else {
                    p2++;
                }
            }else {
                p1++;
                p2++;
            }
        }

    }

    private static void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;

    }
}
