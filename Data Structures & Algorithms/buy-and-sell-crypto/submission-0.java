class Solution {
    public int maxProfit(int[] prices) {
        
       int max_Profit=0;
       int min_buy=Integer.MAX_VALUE;
       for(int i=0;i<prices.length;i++)
    {
        max_Profit=Math.max(max_Profit,prices[i]-min_buy);

        min_buy=Math.min(min_buy,prices[i]);
    }
    return max_Profit; 

    }       
}