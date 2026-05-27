class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    // your code goes here
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    solve(candidates, target, 0, 0, list, temp);
    return list;
  }

  private void solve(
      int[] candidates,
      int target,
      int index,
      int sum,
      List<List<Integer>> list,
      List<Integer> temp) {
    if (index == candidates.length) {
      if (sum == target) {
        list.add(new ArrayList<>(temp));
        return;
      }
      return;
    }
    if(sum>target){
        return;
    }
    temp.add(candidates[index]);

    solve(candidates, target, index, sum + candidates[index], list, temp);
    temp.remove(temp.size() - 1);
    solve(candidates, target, index + 1, sum, list, temp);
  }
}
