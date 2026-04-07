class Solution {
    public int search(int[] n, int target) {

        int i = 0;
        int j = n.length - 1;
        while (i <= j) {
            int mid = (j - i) / 2 + i;

            if (n[mid] == target) {
                return mid;
            } else if (n[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }
}