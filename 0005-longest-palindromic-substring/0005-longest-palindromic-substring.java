class Solution {
    public String longestPalindrome(String s) {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            int left=i;
            int right=i;
            while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right))
            {
               left=left-1;
               right=right+1;
            }
            String current=s.substring(left+1,right);
            if(res.length()<current.length())
            {
                res=current;
            }

            left=i;
            right=i+1;
            while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right))
            {
               left=left-1;
               right=right+1;
            }
            current=s.substring(left+1,right);
            if(res.length()<current.length())
            {
                res=current;
            }
        }
        return res;
    }
}