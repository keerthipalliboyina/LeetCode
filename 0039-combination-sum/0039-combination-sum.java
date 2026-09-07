class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> ds = new ArrayList<>();

    private void findCombinations(int ind, int[] arr, int target) {

        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind]);
            ds.remove(ds.size() - 1);
        }

        findCombinations(ind + 1, arr, target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans.clear();
        ds.clear();
        findCombinations(0, candidates, target);
        return ans;
    }
}