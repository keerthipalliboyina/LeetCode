class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] res=new int[2*n];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<n;j++)
            {
                list.add(nums[j]);
            }
        }
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}