class Solution {
    public int arraySign(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int num:nums)
        {
            if(num==0)
            {
                return signFunc(0);
            }
           else if(num<0)
            {
                count++;
            }
        }
        return signFunc(count % 2 == 0 ? 1 : -1);
    }
    public int signFunc(int x)
    {
        if(x>0)
        {
            return 1;
        }
        else if(x<0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}