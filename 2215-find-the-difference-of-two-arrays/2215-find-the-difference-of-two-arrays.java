class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        HashSet<Integer> list1=new HashSet<>();
        HashSet<Integer> list2=new HashSet<>();
        for(int num:nums1)
        {
            list1.add(num);
        }
        for(int num:nums2)
        {
            list2.add(num);
        }
        ArrayList<Integer> ans1 = new ArrayList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();
        for(int num:list1)
        {
            if(!list2.contains(num))
            {
                ans1.add(num);
            }
        }
        for(int nu:list2)
        {
            if(!list1.contains(nu))
            {
                ans2.add(nu);
            }
        }
        list.add(ans1);
        list.add(ans2);
        return list;
    }
}