class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do
        {
            slow=squre(slow);
            fast=squre(squre(fast));
        }while(slow!=fast);
        return slow==1;
    }
    public int squre(int num)
    {
        int sum=0;
            while(num!=0)
            {
                int r=num%10;
                sum=sum+r*r;
                num=num/10;
            }
            return sum;
    }
}
