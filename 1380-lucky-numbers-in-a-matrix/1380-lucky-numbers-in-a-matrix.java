class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int len=matrix.length;
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        while(i<len)
        {
            int min=matrix[i][0];
            int col=0;
            for(int j=1;j<matrix[i].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                    col=j;
                   
                }
            }
           
            int max=matrix[0][col];
            for(int k=1;k<len;k++)
            {
                if(matrix[k][col]>max)
                {
                    max=matrix[k][col];
                }
            }

            if(min==max)
            {
                list.add(min);
            }
            i++;
        }
        return list;
    }
}