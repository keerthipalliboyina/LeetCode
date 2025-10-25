class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n1=arr1.length;
        int n2=arr2.length;
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> remaining=new ArrayList<>();
       
        for(int num:arr2)
        {
            set.add(num);
        }
        for(int num1:arr2)
        {
            for(int num2:arr1)
            {
                if(num1==num2)
                {
                    list.add(num1);
                }
            }
        }
        for(int num:arr1)
        {
            if(!set.contains(num))
            {
                remaining.add(num);
            }
        }
       Collections.sort(remaining);
       list.addAll(remaining);
        int[] res=new int[list.size()];
       for(int i=0;i<list.size();i++)
       {
           res[i]=list.get(i);
       }
       return res;
    }
}