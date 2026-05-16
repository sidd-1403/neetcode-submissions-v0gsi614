class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int mini = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[low] <= nums[mid]) {
                mini = Math.min(nums[low], mini);
                low = mid + 1;
            } else {
                mini = Math.min(nums[mid], mini);
                high = mid - 1;
            }
        }
        return mini;
    }
}
