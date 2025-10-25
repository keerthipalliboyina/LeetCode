class Solution {
    public int totalMoney(int n) {

        int sum=0;
        if(n<=7)
        {
            for(int i=0;i<n;i++)
            {
                sum=sum+(i+1);
            }
        }
        else
        {
            int i=0;
            int week=1;
            while(n!=0)
            {
                sum=sum+i+week;
                n--;
                i++;
                if (i == 7) {  
                    week++;
                    i = 0;   
                }
            }

        }
        return sum;
    }
}