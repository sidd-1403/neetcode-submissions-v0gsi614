class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        solve(list, temp, nums, check);
        return list;
    }

    private void solve(List<List<Integer>> list, List<Integer> temp, int[] nums, boolean[] check) {
        if (temp.size() == nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!check[i]) {
                temp.add(nums[i]);
                check[i] = true;
                solve(list, temp, nums, check);
                temp.remove(temp.size() - 1);
                check[i] = false;
            }
        }
    }
}