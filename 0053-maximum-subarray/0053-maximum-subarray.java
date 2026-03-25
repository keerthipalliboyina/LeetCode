class Solution {
    public int maxSubArray(int[] nums) {
        int CurrentSum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int num:nums)
        {
           CurrentSum+=num;
           maxsum=Math.max(CurrentSum,maxsum);
           if(CurrentSum<0)
           {
            CurrentSum=0;
           }
        }
        return maxsum;
    }
}