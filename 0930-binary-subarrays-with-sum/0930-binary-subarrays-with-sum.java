class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left=0;
        int right=0;
        int count=0;
        int sum=0;
        int zeros=0;
        while(right<nums.length)
        {
            sum=sum+nums[right];
            while(left<right && sum>goal)
            {
                sum=sum-nums[left];
                left++;
                zeros=0;
            }

            if(sum==goal)
            {
                
                while(left<right && nums[left]==0)
                {
                    zeros++;
                    left++;
                }
                count+=zeros+1;
            }

            right++;
        }
        return count;
    }
}