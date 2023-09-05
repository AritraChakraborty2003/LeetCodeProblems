class Solution {
    public int maxProfit(int[] prices) {
        int min_so_far=prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            min_so_far=Math.min(min_so_far,prices[i]);
            int profit=prices[i]-min_so_far;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}