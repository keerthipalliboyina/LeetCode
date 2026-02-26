class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left=cardPoints.length-k;
        int right=0;
        int max=0;
        int cur=0;
        for(int i=left;i<cardPoints.length;i++)
        {
            cur=cur+cardPoints[i];
        }
        max=cur;
        while(k>0)
        {
          cur = cur - cardPoints[left] + cardPoints[right];

            left++;
            right++;
            k--;
            max=Math.max(cur,max);
        }
        return max;
    }
}