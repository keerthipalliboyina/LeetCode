class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        int len=candyType.length;
        int count=0;
        for(int i=0;i<candyType.length;i++)
        {
            set.add(candyType[i]);  
        }
        int s=set.size();
        if(s>len/2)
        {
            return len/2;
        }
        else
        {
            return s;
        }
    
        
}
}