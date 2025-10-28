class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        for (int num : nums) {
            if (num > max)
                 max = num;
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += max + i;
        }

        return sum;
    }
}
