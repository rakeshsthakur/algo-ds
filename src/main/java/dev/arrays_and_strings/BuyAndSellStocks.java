package dev.arrays_and_strings;

/**
 * Created by rthakur on 5/2/17.
 */
public class BuyAndSellStocks {
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/#/discuss
    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2)
            return 0;

        int maxSoFar = 0, maxCur = 0;

        for (int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }

        return maxSoFar;
    }

    public static int maxProfitII(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) profit += prices[i + 1] - prices[i];
        }

        return profit;
    }

    public static void main(String[] args) {
        maxProfit(new int[]{2, 1, 2, 1, 0, 1, 2});

        System.out.println(maxProfitII(new int[]{1, 2, 3, 4, 5}));
    }
}
