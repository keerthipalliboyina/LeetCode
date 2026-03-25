class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int CurrMax=0,Maxsum=nums[0];
        int CurrMin=0,Minsum=nums[0];
        int totalSum=0;
        for(int num:nums)
        {
            CurrMax=Math.max(num,CurrMax+num);
            Maxsum=Math.max(Maxsum,CurrMax);

            CurrMin=Math.min(num,CurrMin+num);
            Minsum=Math.min(Minsum,CurrMin);

            totalSum+=num;
        }
        if (Maxsum < 0) return Maxsum;
        return Math.max(Maxsum, totalSum - Minsum);
    }
}