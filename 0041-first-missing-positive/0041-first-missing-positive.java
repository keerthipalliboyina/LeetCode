class Solution {
    public int firstMissingPositive(int[] nums) {
        int max=0;
        int result;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
           if(num>0)
           {
             set.add(num);
           }
        }
        int missing=1;
        while(set.contains(missing))
        {
            missing++;
        }
        return missing;
    }
  
}