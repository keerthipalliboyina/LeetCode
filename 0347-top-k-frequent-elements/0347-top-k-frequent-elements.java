class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
       ArrayList<Map.Entry<Integer,Integer>>list=
        new ArrayList<>(map.entrySet());

        list.sort((a,b) -> a.getValue().compareTo(b.getValue()));
        int n=list.size();
        int j=0;
        int[] arr=new int[k];
        for(int i=n-k;i<n;i++)
        {
            arr[j]=list.get(i).getKey();
            j++;
        }
        return arr;
    }
}