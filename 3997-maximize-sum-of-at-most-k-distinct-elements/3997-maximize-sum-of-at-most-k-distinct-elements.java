import java.util.*;

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums); 
          ArrayList<Integer> list = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (list.isEmpty() || list.get(list.size() - 1) != nums[i]) {
                list.add(nums[i]); 
            }
            if (list.size() == k) break; 
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}
