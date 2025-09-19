class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        int l=set.size();
        ArrayList<Integer> list=new ArrayList<>(set);
        /*for(int i=0;i<l;i++)
        {
            list.add(seti);
        }
        */
        Collections.sort(list);
        int ls=list.size();
        if(ls>=3)
        {
            return list.get(ls-3);
        }
        return list.get(ls-1);
    }
}