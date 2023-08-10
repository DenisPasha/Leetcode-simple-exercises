package org.example;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3,2,4,1};
        int result = semiOrderedPermutation(arr);
        System.out.println(result);

    }

    public static int semiOrderedPermutation(int[] nums) {

        int indexZero = nums[0];
        int indexLast = nums[nums.length - 1];
        int counter = 0;
        int i = 0;
        int j = 1;

        while (nums[0] != 1 || nums[nums.length - 1] != nums.length){

            if (j >= nums.length){
                i = 0;
                j = 1;
            }

            if (nums[i] > nums[j]){
                counter ++;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }else {
                i++;
                j++;
            }

        }

        return counter;

    }

}
