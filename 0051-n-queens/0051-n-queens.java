class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        HashSet<Integer> cols = new HashSet<>();
        HashSet<Integer> diag1 = new HashSet<>(); // row - col
        HashSet<Integer> diag2 = new HashSet<>(); // row + col

        backtrack(0, n, board, cols, diag1, diag2, result);

        return result;
    }

    private void backtrack(
        int row,
        int n,
        char[][] board,
        HashSet<Integer> cols,
        HashSet<Integer> diag1,
        HashSet<Integer> diag2,
        List<List<String>> result
    ) {
        // All queens placed
        if (row == n) {
            List<String> solution = new ArrayList<>();

            for (char[] r : board) {
                solution.add(new String(r));
            }

            result.add(solution);
            return;
        }

        // Try every column
        for (int col = 0; col < n; col++) {

            // Check column and diagonals
            if (cols.contains(col) ||
                diag1.contains(row - col) ||
                diag2.contains(row + col)) {
                continue;
            }

            // Place queen
            board[row][col] = 'Q';

            cols.add(col);
            diag1.add(row - col);
            diag2.add(row + col);

            // Move to next row
            backtrack(row + 1, n, board, cols, diag1, diag2, result);

            // Backtrack
            board[row][col] = '.';

            cols.remove(col);
            diag1.remove(row - col);
            diag2.remove(row + col);
        }
    }
}