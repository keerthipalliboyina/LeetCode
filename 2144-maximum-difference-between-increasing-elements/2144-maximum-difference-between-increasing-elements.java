class Solution {
    public int maximumDifference(int[] nums) {
        int diff,max=-1;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(0 <= i && i< j && j< n && nums[i] < nums[j])
                {
                    diff=nums[j]-nums[i];
                    if(max<diff)
                    {
                        max=diff;
                    }
                }
            }
        }
        return max;
    }
}