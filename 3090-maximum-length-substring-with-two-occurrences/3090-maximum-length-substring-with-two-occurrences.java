class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0,right=0;
        int[] count=new int[26];
        int n=s.length();
        int windowSize=0;
        while(right<n)
        {
            int index=s.charAt(right)-'a';
            if(count[index]<2)
            {
                count[index]++;
                windowSize=Math.max(windowSize,right-left+1);
                right++;
            }
            else
            {
                int leftIndex=s.charAt(left)-'a';
                count[leftIndex]--;
                left++;
            }
        }
        return windowSize;
    }
}