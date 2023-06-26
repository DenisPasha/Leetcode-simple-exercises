package org.example.leetCode75Exercises.calculateThePivotIndex;

public class Main {
    //Given an array of integers nums, calculate the pivot index of this array.
    //
    //The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
    //
    //If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
    //
    //Return the leftmost pivot index. If no such index exists, return -1.
    public static void main(String[] args) {

        int[] arr = {-1,-1,0,0,-1,-1};

        int pivotIndex = pivotIndex(arr);
        System.out.println(pivotIndex);
    }

    public static int pivotIndex(int[] nums) {

        int leftSide = 0;
        int rightSide = 0;
        int toReturn = -1;


        for (int i = 0; i < nums.length; i++) {
            int pivot = i;
            if (pivot == 0){
                leftSide = 0;
               rightSide = getRightSide(nums , pivot);
            }else if (pivot == nums.length - 1){
                leftSide = getLeftSide(nums , pivot);
                rightSide = 0;
            }else {
                leftSide = getLeftSide(nums , pivot);
                rightSide = getRightSide(nums , pivot);
            }

            if (leftSide == rightSide){
                 toReturn = pivot;
                 break;
            }
        }

        return toReturn;
    }

    private static int getLeftSide(int[] nums, int pivot) {
        int sumToLeft = 0;
        for (int i = pivot - 1; i >=0 ; i--) {
            sumToLeft+=nums[i];
        }
        return sumToLeft;
    }

    private static int getRightSide(int[] nums, int pivot) {
        int sumToRight = 0;
        for (int i = pivot + 1; i < nums.length; i++) {
            sumToRight+=nums[i];
        }
        return sumToRight;
    }


}
