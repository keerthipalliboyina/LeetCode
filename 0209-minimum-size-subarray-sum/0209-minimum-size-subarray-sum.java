class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int windowSize=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++)
        {
            sum=sum+nums[right];
            while(sum>=target)
            {
                windowSize=Math.min(windowSize,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        return windowSize==Integer.MAX_VALUE?0:windowSize;
    }
}