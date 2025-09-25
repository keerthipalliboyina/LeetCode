class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr)
        {
            set.add(num);
        }
        int missing=1;
        int count=0;
        while(true)
        {
            if(!set.contains(missing))
            {
                count++;
                if(count==k)
                {
                    return missing;
                }
            }
             missing++;
        }
    }
}