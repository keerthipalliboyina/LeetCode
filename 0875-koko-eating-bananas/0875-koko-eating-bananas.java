class Solution {
    public boolean ans(int[] piles,int h,int mid){
       double sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=Math.ceil((double)piles[i]/mid);
        }
        if(sum<=h){
            return true;
        }
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
      
        }
        int low=1;
        int high=max;

        while(low<=high){
            int mid=low+(high-low)/2;
            boolean sol=ans(piles,h,mid);
            if(sol==true){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}