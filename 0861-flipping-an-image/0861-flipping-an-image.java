class Solution {
    public int[] reverse(int[] n,int m)
    {
        int start=0,end=m-1;
        int temp;
         while(start<end)
         {
              temp=n[start];
              n[start]=n[end];
              n[end]=temp;
              start++;
              end--;
        }
        return n;
    }
    public int[][] flipAndInvertImage(int[][] image) {
        //List<List<Integer>> arr=new ArrayList<>();
        int len=image.length;
        for(int i=0;i<len;i++)
        {
            int m=image[i].length;
            reverse((image[i]),m);
            for(int j=0;j<m;j++)
            {
                 if(image[i][j]==0)
                 {
                    image[i][j]=1;
                 }
                 else{
                     image[i][j]=0;
                 }
            }
        }
        return image;
    }
}