package org.example.leetCode75Exercises.tribonacci;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //The Tribonacci sequence Tn is defined as follows:
    //
    //T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
    //
    //Given n, return the value of Tn.
    public static void main(String[] args) {

        int tribonacci = tribonacci(0);
        System.out.println(tribonacci);

    }

    public static int tribonacci(int n) {

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(1);

        if (n < 2){
            return list.get(n);
        }
        for (int i = 2; i < n; i++) {
            list.add( list.get(i) + list.get(i-1)+list.get(i-2));
        }
        return list.get(list.size()-1);
    }
}
