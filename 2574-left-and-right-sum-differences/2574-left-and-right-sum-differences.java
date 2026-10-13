class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                left[i]=0;
                sum+=nums[i];
            }
            else{
                 left[i]=sum;
                sum=sum+nums[i];
           
            }
        }
        sum=0;
        for(int j=n-1;j>=0;j--)
        {
            if(j==n-1)
            {
                right[j]=0;
                 sum=sum+nums[j];
            }
            else{
                 right[j]=sum;
                  sum=sum+nums[j];
           
            }
        }

        for(int i=0;i<n;i++)
        {
            nums[i]=Math.abs(left[i]-right[i]);
        }
        return nums;
    }
}