class Solution{
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxcount=0;
        int[] res=new int[2];
        int rownumber=0;
        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    count=count+1;
                }
                if(count>maxcount)
                {
                    maxcount=count;
                     rownumber=i;
                }
            }
        }
        res[0]=rownumber;
        res[1]=maxcount;
        return res;
    }
}
           