class Solution {
    public int arrangeCoins(int n) {
        int row=0;
        int count=0;
        while(n>=row+1)
        {
            count++;
            row++;
            n-=row;
        }
        return count;
    }
}