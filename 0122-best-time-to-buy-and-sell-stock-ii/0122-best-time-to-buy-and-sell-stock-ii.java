class Solution {
    public int maxProfit(int[] prices) {
        int sum=0,i=1;
        while(i<prices.length)
        {
            int p=prices[i]-prices[i-1];
            {
                if(p>0)
                {
                    sum=sum+p;
                }
                i++;
            }
        }
        return sum;
    }
}