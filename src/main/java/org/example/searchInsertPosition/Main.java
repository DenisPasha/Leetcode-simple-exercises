package org.example.searchInsertPosition;

public class Main {

    //Given a sorted array of distinct integers and a target value,
    // return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    //
    //You must write an algorithm with O(log n) runtime complexity.
    public static void main(String[] args) {

        int [] arr = {1,3,5,6};
        int target = 5;
        searchInsert(arr , target);
    }

    public static void searchInsert(int[] nums, int target) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];

            if (currentNum == target){
                index = i;
                return;
            } else if (currentNum > target) {
                index = i;
                return;
            }
        }
    }
}
