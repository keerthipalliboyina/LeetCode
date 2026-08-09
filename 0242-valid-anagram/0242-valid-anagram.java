class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        char[] ch2=t.toCharArray();
        Arrays.sort(ch2);
        int l1=s.length();
        int l2=t.length();
        if(l1!=l2)
        {
            return false;
        }
        int left=0;
        while(left<l1)
        {
            if(ch[left]!=(ch2[left]))
            {
                return false;
            }
            left++;
        }
        return true;

    }
}