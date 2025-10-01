class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        boolean allequal=true;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[0])
            {
                allequal=false;
                break;
            }
        }
        if(allequal)
        {
            return 0;
        }
        return 1;
    }
}