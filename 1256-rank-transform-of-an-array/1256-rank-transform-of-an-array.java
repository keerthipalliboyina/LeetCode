class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        int[] rey=new int[set.size()];
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=0;
        for(int num:set)
        {
            rey[j++]=num;
        }
        int[] res=new int[n];
        Arrays.sort(rey);
        for(int k=0;k<rey.length;k++)
        {
            map.put(rey[k],k+1);
        }
        for(int i=0;i<n;i++)
        {
            res[i]=map.get(arr[i]);
        }
        return res;
        
    }
}