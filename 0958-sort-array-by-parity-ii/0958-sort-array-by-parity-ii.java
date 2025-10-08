class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int evenindex=0;
        int[] res=new int[n];
        int oddindex=1;
        for(int num:nums)
        {
            if(num%2==0)
            {
                res[evenindex]=num;
                evenindex+=2;
            }
            else
            {
                res[oddindex]=num;
                oddindex+=2;
            }
        }
        return res;
    }
}