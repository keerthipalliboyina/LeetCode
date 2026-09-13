class Solution {
    public int[] replaceElements(int[] arr) {
        int i=0;
        int n=arr.length;
        while(i<n-1)
        {
            int max=arr[i+1];
            for(int j=i+1;j<n;j++)
            {
                if(max<arr[j])
                {
                    max=arr[j];
                }
            }
            arr[i]=max;
            i++;
            
        }
        arr[n-1]=-1;
        return arr;
    }
}