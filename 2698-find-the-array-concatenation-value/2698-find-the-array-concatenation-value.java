class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i = 0, j = nums.length - 1;
        long sum = 0;
        while (i < j) {
            String s = String.valueOf(nums[i]) + String.valueOf(nums[j]);
            sum += Long.parseLong(s);
            i++;
            j--;
        }
        if (i == j) sum += nums[i];
        return sum;
    }
}
