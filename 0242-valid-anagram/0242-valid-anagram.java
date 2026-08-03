class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
         if (s.length() != t.length()) {
            return false;
        }
        char[] a1=s.toCharArray();
        char[] a2=t.toCharArray();

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<n1;i++)
        {
             map.put(a1[i],map.getOrDefault(a1[i],0)+1);
        }

        for(int j=0;j<n2;j++)
        {
            if(!map.containsKey(a2[j]))
            {
                return false;
            }

            map.put(a2[j], map.get(a2[j]) - 1);
            if(map.get(a2[j])<0)
            {
                return false;
            }
        }
        return true;
    }
}