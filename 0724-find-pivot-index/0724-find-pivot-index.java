class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
             int sum=0;
        int sum2=0;
             for(int j=0;j<i;j++)
             {
                sum=sum+nums[j];
             }
             for(int k=i+1;k<nums.length;k++)
             {
                sum2=sum2+nums[k];
             }
              if(sum==sum2)
             {
                return i;
             }
        }
       
        return -1;
        
    }
}