class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length/2;
        for(int num:nums)
        {
             map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == n) {
                return key;
            }
        }

        return -1;
    }
}