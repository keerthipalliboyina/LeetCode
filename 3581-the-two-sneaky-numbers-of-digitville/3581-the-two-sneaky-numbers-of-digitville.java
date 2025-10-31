import java.util.*;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> resList = new ArrayList<>();
        for (int num : freq.keySet()) {
            if (freq.get(num) == 2) {
                resList.add(num);
            }
        }

        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }

        return res;
    }
}
