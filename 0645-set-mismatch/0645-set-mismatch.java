class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate=0,element=0;
        int n=nums.length;
        int[] freq=new int[n+1];
        
        for(int num:nums)
        {
            freq[num]++;
        }
        for(int i=0;i<=n;i++)
        {
            if(freq[i]==2)
            {
                duplicate=i;
            }
            if(freq[i]==0)
            {
               element=i;
            }
        }
        return new int[]{duplicate,element};
    }
}