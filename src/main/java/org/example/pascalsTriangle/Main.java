package org.example.pascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //Given an integer numRows, return the first numRows of Pascal's triangle.

    //Input: numRows = 5
    //Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    public static void main(String[] args) {
        List<List<Integer>> generate = generate(7);

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listToReturn = new ArrayList<>();

        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        listToReturn.add(firstList);

        for (int i = 0; i < numRows - 1; i++) {
            List<Integer> listToAdd = new ArrayList<>();
            int currentListSize = i + 2;

            if (currentListSize <= 2){
                listToAdd.add(1);
                listToAdd.add(1);
                listToReturn.add(listToAdd);
                continue;
            }
            for (int j = 0; j < currentListSize ; j++) {
                List<Integer> listAboveThisOne = listToReturn.get(i);
                int left = 0;
                int right = 0;
                if (j > 0){
                    left = listAboveThisOne.get(j - 1);
                }
                if (j < currentListSize - 1){
                    right = listAboveThisOne.get(j );
                }
                listToAdd.add(left + right);

            }
            listToReturn.add(listToAdd);

        }
        return listToReturn;
    }
}
