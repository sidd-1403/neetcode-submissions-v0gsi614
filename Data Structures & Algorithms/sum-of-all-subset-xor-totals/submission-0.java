class Solution {
    int totalSum = 0;

    public int subsetXORSum(int[] nums) {
        solve(0, nums, 0);
        return totalSum;
    }

    private void solve(int index, int[] nums, int sumXor) {
        if (index == nums.length) {
            totalSum += sumXor;
            return;
        }

        solve(index + 1, nums, sumXor ^ nums[index]);
        solve(index + 1, nums, sumXor);
    }
}