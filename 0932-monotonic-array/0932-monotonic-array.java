class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        int count=0;
        int count1=0;
        for(int i=0;i<n-1;i++)
        {
            int j=i+1;
            if(i<=j && nums[i]<=nums[j])
            {
               count++;;
            }
        }
        for(int i=0;i<n-1;i++)
        {
            int j=i+1;
            if(i<=j && nums[i]>=nums[j])
            {
                count1++;
            }
        }
        if(count==n-1 || count1==n-1)
        {
            return true;
        }
        return false;
    }
}