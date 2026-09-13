class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        for(int i=0;i<=n-2;i++)
        {
            for(int j=i+1;j<=n-1;j++)
            {
                if(i<j && prices[j]<=prices[i])
                {
                    prices[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        prices[n-1]=prices[n-1];
        return prices;
    }
}