class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profits = 0;
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
            profits = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profits);
        }
        return maxProfit;
    }
}