class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        int n=nums.length;
        double max=(double)sum/k;
        int end=k;
        for(int j=1;j<=n-k;j++)
        {
            sum=sum-nums[j-1]+nums[end];
            double avg=(double)sum/k;
            max=Math.max(max,avg);
            end++;
        }
        return max;
    }
}