class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] suff=new int[nums.length];
        int s=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            suff[i]=s;
            s=s*nums[i];
            
        }

        int[] pre=new int[nums.length];
        int p=1;
        for(int i=0;i<nums.length;i++)
        {
            pre[i]=p;  
            p=p*nums[i];
                 
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = pre[i] * suff[i];
        }

        return result;
    }
}