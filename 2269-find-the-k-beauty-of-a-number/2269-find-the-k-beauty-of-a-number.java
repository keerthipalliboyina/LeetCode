class Solution {
    public int divisorSubstrings(int num, int k) {
        int len=(int)Math.log10(num)+1;
        int div=(int)Math.pow(10,k);
        int temp=num;
        int times=len-k+1;
       int count=0;
        while(times>0)
        {
           int  cal=num%div;
            if(cal!=0  && temp%cal==0)
            {
                count++;
            }
            num=num/10;
            times--;
        }
        return count;
    }
}