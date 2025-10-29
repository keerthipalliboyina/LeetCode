class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int max=-1;
        for(int num:arr)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int num:freq.keySet())
        {
            if(num==freq.get(num))
            {
                max=Math.max(max,num);
            }
        }
        return max;

    }
}