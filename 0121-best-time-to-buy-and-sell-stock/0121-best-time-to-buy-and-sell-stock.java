class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max_Profit = 0;
        int buy_Prices = prices[0];
        for(int i=1; i<n; i++){
            int curr_Profit = prices[i] - buy_Prices;
            if(curr_Profit > max_Profit){
                max_Profit = curr_Profit;
            }
            if(buy_Prices > prices[i]){
                buy_Prices = prices[i];
            }
        }
    return max_Profit;
    }
}