class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        int n = arr.length - 1;
        int maxi = -1;
        for (int i = n; i >= 0; i--) {
            if (i == n) {
                res[i] = maxi;
                continue;
            }
            maxi = Math.max(maxi, arr[i + 1]);
            res[i] = maxi;
        }
        return res;
    }
}