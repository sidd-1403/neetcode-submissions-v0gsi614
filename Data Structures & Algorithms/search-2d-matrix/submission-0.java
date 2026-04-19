class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

     /*here we apply BS bcz if this matrix is flatten then element like
      1,3,5,7,10,11,16,20,23,30,34,60 so here we can easily apply bs after that convert into 2D Matrix
     and result is getting...
     */
        int row = matrix.length;
        int col = matrix[0].length;

        int i = 0;
        int j = row * col - 1;

        while (i <= j) {
            int mid = (j - i) / 2 + i;

            int r = mid / col;
            int c = mid % col;

            int value = matrix[r][c];
            if (value == target) {
                return true;
            } else if (value > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return false;

    }
}