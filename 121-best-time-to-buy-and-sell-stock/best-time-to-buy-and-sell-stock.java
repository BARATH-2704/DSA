class Solution {
    public int maxProfit(int[] prices) {

        int slow = 0;
        int profit = 0;

        for (int fast = 1; fast < prices.length; fast++) {

            if (prices[fast] < prices[slow]) {
                slow = fast;
            } else {
                profit = Math.max(profit, prices[fast] - prices[slow]);
            }
        }

        return profit;
    }
}