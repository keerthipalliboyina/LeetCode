class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
         HashMap<Character,Integer> fre=new HashMap<>();
        int n2=t.length();
         int n1=s.length();
         char[] arr=s.toCharArray();
         char[] arr2=t.toCharArray();
        
         for(int i=0;i<n1;i++)
         {
            fre.put(arr[i],fre.getOrDefault(arr[i],0)+1);
         }
         for(int i=0;i<n2;i++)
         {
            if(!fre.containsKey(arr2[i]))
            {
                 return false;
            }
            fre.put(arr2[i],fre.get(arr2[i])-1);
             if(fre.get(arr2[i]) < 0){
                return false;
             }

         }
         return true;
    }
}