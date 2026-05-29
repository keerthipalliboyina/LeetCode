class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int result=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            int t=nums[i];
            while(t!=0)
            {
                int r=t%10;
                sum=sum+r;
                t=t/10;
            }
            result=Math.min(result,sum);
        }
        return result;
    }
}