class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    solve(res, temp, 0, nums);
    return res;
  }

  private void solve(List<List<Integer>> list, List<Integer> temp, int index, int[] nums) {
    if (index == nums.length) {
      list.add(new ArrayList<>(temp));
      return;
    }

    temp.add(nums[index]);
    solve(list, temp, index + 1, nums);
    temp.remove(temp.size() - 1);
    while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
      index++;
    }
    solve(list, temp, index + 1, nums);
  }
}
