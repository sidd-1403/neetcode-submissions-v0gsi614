class Solution {
    public List<List<Integer>> fourSum(int[] n, int target) {

        long sum = 0;
        Arrays.sort(n);
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n.length - 3; i++) {
            if (i > 0 && n[i] == n[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n.length - 2; j++) {
                if (j > i + 1 && n[j] == n[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = n.length - 1;

                while (k < l) {
                    sum = (long) n[i] + n[j] + n[k] + n[l];
                    if (sum == target) {
                        list.add(Arrays.asList(n[i], n[j], n[k], n[l]));
                        k++;
                        l--;

                        while (k < l && n[k] == n[k - 1]) {
                            k++;
                        }
                        while (k < l && n[l] == n[l + 1]) {
                            l--;
                        }
                    } else if (sum > target) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return list;
    }
}