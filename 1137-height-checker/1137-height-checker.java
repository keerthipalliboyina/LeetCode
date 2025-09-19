class Solution {
    public int heightChecker(int[] heights) {
        ArrayList<Integer> set=new ArrayList<>();
        for(int i=0;i<heights.length;i++)
        {
            set.add(heights[i]);
        }
        int count=0;
        Collections.sort(set);
        for(int i=0;i<heights.length;i++)
        {
             if(set.get(i)!=heights[i])
             {
                count++;
             }
        }
        return count;
    }
}