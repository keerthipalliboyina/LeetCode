class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int num:weights)
        {
            sum+=num;
            max=Math.max(max,num);
        }
        int left=max;
        int right=sum;
        int ans=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int res=count(weights,mid);
            
            if(res<=days)
            {
                ans=mid;
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return ans;
    }
    public int count(int[] nums,int weight)
    {
        int sum=0;
        int count=1;
        for(int num:nums)
        {
            if(sum+num>weight)
            {
                count++;
                sum=num;
            }
            else
            {
                sum+=num;
            }
        }
        return count;
    }
}