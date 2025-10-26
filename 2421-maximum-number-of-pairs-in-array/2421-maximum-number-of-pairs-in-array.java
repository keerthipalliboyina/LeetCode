class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int pairs=0;
        int leftovers=0;
        int[] res=new int[2];
        for(int val:map.values())
        {
             pairs += val / 2;    
            leftovers += val % 2; 
        }
        res[0]=pairs;
        res[1]=leftovers;
        return res;
    }
}