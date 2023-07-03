package org.example.leetCode75Exercises.maxProfit;

public class Main {
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
