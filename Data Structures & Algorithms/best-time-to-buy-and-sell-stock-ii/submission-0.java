class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int sum=0;

        for (int i = 0; i < prices.length-1; i++) {
            max=prices[i+1]-prices[i];

            if (max>0)
            {
                sum=sum+max;
            }

        }
        return sum;
    
    }
}