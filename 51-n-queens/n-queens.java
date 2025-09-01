class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char row[] : board) Arrays.fill(row, '.');
        backtrack(board, 0, n, result);
        return result;
    }

    private void backtrack(char[][] board, int row, int n, List<List<String>> res){
        if(row == n){
            List<String> current = new ArrayList<>();
            for(char r[] : board) current.add(new String(r));
            res.add(current);
            return;
        }
        for(int col = 0; col < n; col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 'Q';
                backtrack(board, row + 1, n, res);
                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][]board, int row, int col, int n){
        // for column
        for(int i = 0; i<row; i++){
            if(board[i][col] == 'Q')return false;
        }

        // for left diagonal
        for(int i = row-1, j = col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q')return false;
        }

        // for right diagonal
        for(int i = row - 1, j = col + 1; i>=0 && j<n; i--, j++){
            if(board[i][j] == 'Q')return false;
        }
        return true;
    }
}