package org.example.leetCode75Exercises;

public class Main {

    public static void main(String[] args) {
        int[] arr = {0,0,9,0,0};

        int[] answer = productExceptSelf(arr);
        System.out.println();

    }

    public static int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] toReturn = new int[length];

        int i = 0;

        while (i < nums.length){
            int[] left = new int[i + 1];
            int[] right = new int[nums.length - (i + 1)];



            int leftSum = getLeftSum(nums , i);
            int rightSum = getRightSum(nums , i);

            toReturn[i] = leftSum * rightSum;

            i++;
        }



        return toReturn;
    }

    private static int getLeftSum(int[] nums, int i) {
        int toReturn = 1;
        for (int j = 0; j < i; j++) {
            toReturn *= nums[j];
        }
        return toReturn;
    }

    private static int getRightSum(int[] nums, int i) {
        int toReturn = 1;
        for (int j = i + 1; j < nums.length; j++) {
            toReturn *= nums[j];
        }
        return toReturn;

    }


}


