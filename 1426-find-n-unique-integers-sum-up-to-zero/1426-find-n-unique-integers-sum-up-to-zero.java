class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int i = 0;
        int val = 1;

        if(n==1){
            arr[0]=0;
            return arr;
        }
        if(n%2 == 0){
            while(n>0){
                arr[i++] = val;
                arr[i++] = -val;
                val++;
                n-=2;
            }
        }
        else{
            arr[0] = 0;
            n--;
            while(n>0){
                arr[i++] = val;
                arr[i++] = -val;
                val++;
                n-=2;
            }
        }
        return arr;
    }
}