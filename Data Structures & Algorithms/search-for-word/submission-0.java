class Solution {
    int[][] dr = {
            { -1, 0 },
            { 1, 0 },
            { 0, -1 },
            { 0, 1 }
    };
    int m = 0;
    int n = 0;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(word, board, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;

    }

    private boolean dfs(String word, char[][] board, int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || row >= m || col < 0 || col >= n) {
            return false;
        }
        if (board[row][col] != word.charAt(index)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        for (int i = 0; i < 4; i++) {
            int nr = row + dr[i][0];
            int nc = col + dr[i][1];

            if (dfs(word, board, nr, nc, index + 1)) {
                return true;
            }

        }

        board[row][col] = temp;
        return false;
    }
}