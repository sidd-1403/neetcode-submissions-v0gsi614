class Solution {
    public int minEatingSpeed(int[] nums, int h) {
    int low = 1;
    int high = 1;
    for (int num : nums) {
      high = Math.max(num, high);
    }

    while (low < high) {
      int mid = low + (high - low) / 2;
      long totalHours = canFinish(mid, nums);
      if (totalHours <= h) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    return high;
  }

  private long canFinish(int hourly, int[] nums) {
    long totalHours = 0;
    for (int i = 0; i < nums.length; i++) {
      totalHours += Math.ceil((double) nums[i] / hourly);
    }
    return totalHours;
  }
}
