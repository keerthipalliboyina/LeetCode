class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    int sum=0;
    public int subsetXORSum(int[] nums) {

       subset(nums,0);
       return sum;

    }
    void subset(int[] n,int ind)
    {
        if(ind>=n.length)
        {
            int xor=0;
            for(int i=0;i<list.size();i++)
            {
                 xor=xor ^ list.get(i);
            }
            sum=sum+xor;
            return;
        }
        list.add(n[ind]);
        subset(n,ind+1);
        list.remove(list.size()-1);
        subset(n,ind+1);

    }
}