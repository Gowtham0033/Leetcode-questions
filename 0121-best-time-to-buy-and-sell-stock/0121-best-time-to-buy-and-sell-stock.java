class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int maxprofit=0;
        int n=prices.length;
        int buy=0;
        for(int sell=1;sell<n;sell++)
        {
            if(prices[sell]>prices[buy])
            {
                profit=prices[sell]-prices[buy];
                maxprofit=Math.max(profit,maxprofit);
            }
            else
            {
                buy=sell;
            }
        }
        return maxprofit;
        
    }
}