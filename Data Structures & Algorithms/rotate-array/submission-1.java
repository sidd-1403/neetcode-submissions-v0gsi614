class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        rotateArray(nums, 0, n - 1);
        rotateArray(nums, 0, k - 1);
        rotateArray(nums, k, n - 1);

    }

    static void rotateArray(int n[], int i, int j) {
        while (i < j) {
            int temp = n[i];
            n[i] = n[j];
            n[j] = temp;
            i++;
            j--;
        }
    }

}