class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ch=s.toCharArray();
        ArrayList<Character> list=new ArrayList<>();
        int left=0;
        int maxLength=0;
        for(int right=0;right<ch.length;right++)
        {
            while(list.contains(ch[right]))
            {  
                list.remove(Character.valueOf(ch[left]));
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
            list.add(ch[right]);
        }
        return maxLength;

    }
}