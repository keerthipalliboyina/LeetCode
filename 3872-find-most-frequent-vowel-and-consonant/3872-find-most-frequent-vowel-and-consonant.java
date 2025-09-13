class Solution {
    public int maxFreqSum(String s) {
        int vmax=0,cmax=0;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(Character c:s.toCharArray())
        {
            if(c=='a'  || c=='e' || c=='i' || c=='o' || c=='u')
            {
                map1.put(c,map1.getOrDefault(c,0)+1);
                int r=map1.get(c);
                if(vmax<r) vmax=r;
            }
            else
            {
                map2.put(c,map2.getOrDefault(c,0)+1);
                int rr=map2.get(c);
                if(cmax<rr) cmax=rr;
            }
        }
        return vmax+cmax;
    }
}