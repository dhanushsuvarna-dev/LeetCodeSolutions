class Solution {

    public boolean exist(char[][] board, String word) {

        int count = 0, loc = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == word.charAt(0)) {

                    if (dfs(board, word, i, j, loc)) {
                        count = word.length();
                        return true;
                    }
                }
            }
        }

        return count == word.length();
    }

    public boolean dfs(char[][] board, String word, int i, int j, int loc) {

        // All characters found
        if (loc == word.length()) {
            return true;
        }

        // Outside board
        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length) {
            return false;
        }

        // Character doesn't match
        if (board[i][j] != word.charAt(loc)) {
            return false;
        }

        // Mark current cell as visited
        char temp = board[i][j];
        board[i][j] = '1';

        // Check up, down, left, right
        boolean result =
            dfs(board, word, i - 1, j, loc + 1) ||
            dfs(board, word, i + 1, j, loc + 1) ||
            dfs(board, word, i, j - 1, loc + 1) ||
            dfs(board, word, i, j + 1, loc + 1);

        // Backtrack
        board[i][j] = temp;

        return result;
    }
}