package org.example.leetCode75Exercises.kidsWiththeGreatestNumberofCandies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] arr = {4,2,1,1,2};
        int extra = 1;
        List<Boolean> booleans = kidsWithCandies(arr, extra);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> arrToReturn = new ArrayList<>();


        for (int j = 0; j < candies.length; j++) {
            int currentCandie = candies[j] + extraCandies;
            boolean isLess = false;

            for (int k = 0; k < candies.length; k++) {
                if (currentCandie < candies[k]){
                    isLess = true;
                    arrToReturn.add(false);
                    break;
                }

            }
            if (!isLess){
                arrToReturn.add(true);
            }
        }

        return arrToReturn;
    }
}
