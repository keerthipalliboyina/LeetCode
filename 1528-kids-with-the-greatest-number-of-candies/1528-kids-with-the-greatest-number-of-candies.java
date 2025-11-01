class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int  n=candies.length;
        ArrayList<Boolean> list=new ArrayList<>();
        int max=0;
        for(int num:candies)
        {
            if(num>max){
                max=num;
            }
        }
        for(int num:candies)
        {
            int count=num+extraCandies;
            if(count>=max)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
}