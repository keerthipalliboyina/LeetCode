class Solution {
    public int climbStairs(int n) {
        if(n==1)
        {
            return 1;
        }
        else if(n==2)
        {
            return 2;
        }
        int ans=0;
        int x=1,y=2;
        for(int i=2;i<n;i++)
        {
            ans=x+y;
            x=y;
            y=ans;
        }
        return ans;
    }
}
