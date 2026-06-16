class Solution {
  public List<List<Integer>> subsets(int[] nums) {

    List<List<Integer>> list = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    findSets(list, temp, 0, nums);
    return list;
  }

  private void findSets(List<List<Integer>> list, List<Integer> temp, int index, int[] nums) {
    if (index == nums.length) {
      list.add(new ArrayList<>(temp));
      return;
    }
    temp.add(nums[index]);
    findSets(list, temp, index + 1, nums);
    temp.remove(temp.size() - 1);
    findSets(list, temp, index + 1, nums);
  }
}
