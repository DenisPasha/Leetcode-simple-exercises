package org.example.twoSum;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;

        int[] ints = twoSum(arr, target);

    }

    public static int[] twoSum(int[] nums, int target) {

        int currentSum = 0;
        int[] twoSum = new int[2];


        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length ; j++) {
                int current = nums[i] + nums[j];
                if (current == target){
                    twoSum[0] = i;
                    twoSum[1] = j;
                }
            }

        }
        return twoSum;
    }
}
