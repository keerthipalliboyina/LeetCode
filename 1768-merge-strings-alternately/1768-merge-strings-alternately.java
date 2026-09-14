class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1=word1.length();
        int w2 = word2.length();
        int i=0;
        int j=0;
        StringBuilder res=new StringBuilder();
        while(i<w1 && j< w2)
        {
            res.append(word1.charAt(i));
            res.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<w1)
        {
            res.append(word1.charAt(i));
            i++;
        }
        while(j<w2)
        {
            res.append(word2.charAt(j));
            j++;
        }

        return res.toString();
    }
}