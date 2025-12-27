class Solution {
    public int maxProfit(int[] prices) {
        int minProfit = prices[0];
        int maxProfit = 0;
        int profit = 0;

        for(int i = 0; i<prices.length; i++){
            if(minProfit > prices[i]){
                minProfit = prices[i];
            }
            profit = prices[i] - minProfit;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}