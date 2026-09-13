class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int sum=0;
        for(int num:set)
        {
            int prv=sum;
            sum=sum+num;
            if(prv>sum)
            {
                sum-=num;
            }
        }
        if (sum == 0) {
            int max = Integer.MIN_VALUE;

            for (int num : set) {
                if (num > max) {
                    max = num;
                }
            }

            return max;
        }
        
        return sum;
    }
}