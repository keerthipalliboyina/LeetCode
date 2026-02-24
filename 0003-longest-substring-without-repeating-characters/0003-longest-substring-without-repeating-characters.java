class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int wl=0;
        boolean[] nums=new boolean[256];
        for(int right=0;right<s.length();right++)
        {
            int index=(int)s.charAt(right);
            while(nums[index])
            {
                nums[(int)s.charAt(left)]=false;
                left++;
            }
            nums[index]=true;
            wl=Math.max(wl,right-left+1);

        }
        return wl;
    }
}