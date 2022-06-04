class Solution {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        int[] left_row = new int[n];
        int[] upper_diagonal = new int[2 * n - 1];
        int[] lower_diagonal = new int[2 * n - 1];

        findNQueen(0, ans, board, left_row, lower_diagonal, upper_diagonal);

        return ans;
    }

    public static void findNQueen(int col, List<List<String>> ans, char[][] board, int[] left_row, int[] lower_diagonal, int[] upper_diagonal) {
        if (col == board.length) {
            ans.add(construct(board));
            return;
        }

        for (int rows = 0; rows < board.length; rows++) {
            if (left_row[rows] == 0 && lower_diagonal[rows + col] == 0 && upper_diagonal[board.length - 1 + col - rows] == 0) {
                board[rows][col] = 'Q';
                left_row[rows] = 1;
                lower_diagonal[rows + col] = 1;
                upper_diagonal[(board.length - 1) + col - rows] = 1;
                findNQueen(col + 1, ans, board, left_row, lower_diagonal, upper_diagonal);
                left_row[rows] = 0;
                lower_diagonal[rows + col] = 0;
                upper_diagonal[(board.length - 1) + col - rows] = 0;
                board[rows][col] = '.';
            }
        }
    }

    public static List<String> construct(char[][] board) {
        List<String> res = new LinkedList<String>();
        for (char[] chars : board) {
            String s = new String(chars);
            res.add(s);
        }
        return res;
    }
}