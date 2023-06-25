package org.example.randomExercises.bestTimeToBuyAStock;

public class Main {
    //You are given an array prices where prices[i] is the price of a given stock on the ith day.
    //
    //You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    //
    //Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    //
    //
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int i = maxProfit(arr);
        System.out.println(i);

    }

    public static int maxProfit(int[] prices) {
        int buyAt = prices[0];
        int max_profit = 0;
        for(int i=1;i<prices.length;i++){
            if(buyAt > prices[i]){
                buyAt = prices[i];
            }
            else if(prices[i] - buyAt > max_profit){
                max_profit = prices[i]-buyAt;
            }
        }
        return max_profit;

    }
}
