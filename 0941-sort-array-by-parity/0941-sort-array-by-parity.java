import java.util.ArrayList;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        int[] res = new int[nums.length];

       
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr1.add(nums[i]);
            }
        }

       
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 != 0) {
                arr1.add(nums[j]);
            }
        }

        for (int k = 0; k < arr1.size(); k++) {
            res[k] = arr1.get(k);
        }

        return res;
    }
}