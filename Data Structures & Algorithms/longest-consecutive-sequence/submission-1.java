class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int count = 1;
                int curr = nums[i];
                while (set.contains(curr + 1)) {
                    count++;
                    curr++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
