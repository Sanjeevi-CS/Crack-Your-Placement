class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int arr[] = new int[prices.length];
        for (int i = 0; i < prices.length - 1; i++) {
            arr[i] = prices[i + 1] - prices[i];
        }
        for (int i = 0; i < prices.length; i++) {
            if (arr[i] > 0) {
                profit += arr[i];
            }
        }
        return profit;
    }
}