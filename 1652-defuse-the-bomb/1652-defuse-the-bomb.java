class Solution {
    public int[] decrypt(int[] code, int k) {
        int left=1,right=k;
        int[] num=new int[code.length];
        if(k==0)
        {
            return num;
        }
        if(k<0)
        {
            k=-k;
            left=code.length-k;
            right=code.length-1;
        }
        int sum=0;
        int index=left;
        for(int i=0;i<k;i++)
        {
            sum=sum+code[index++];
        }
        num[0]=sum;
        for(int i=1;i<code.length;i++)
        {
            sum=sum-code[(left++)%code.length];
            sum=sum+code[(++right)%code.length];
            num[i]=sum;
        }
        return num;
    }
}