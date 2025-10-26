class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int pro1=nums[0]*nums[1];
        int pro2=nums[n-1]*nums[n-2];
        return pro2-pro1;
    }
}