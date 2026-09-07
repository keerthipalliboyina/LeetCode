class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    ArrayList<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        subset(nums,0);
        return result;
    }
    void subset(int[] n,int ind)
    {
         if(ind>=n.length)
         {
            result.add(new ArrayList<>(list));
            return;
         }
         list.add(n[ind]);
         subset(n,ind+1);
         list.remove(list.size()-1);
         subset(n,ind+1);
    }
}