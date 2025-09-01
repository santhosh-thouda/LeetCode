class Solution {
    public int totalNQueens(int n) {
        // if(n == 0 || n == 1)return n;
        List<List<String>> result = new ArrayList<>();
        // int count = 0;
        char[][]board = new char[n][n];
        for(char r[] : board) Arrays.fill(r, '.');
        return backtrack(board, 0, n, result);
    }

    private int backtrack(char[][] board, int row, int n, List<List<String>> res){
        if(row == n){
            List<String> current = new ArrayList<>();
            for(char []r : board)current.add(new String(r));
            res.add(current);
            return 1;
        }
        int count = 0;
        for(int col = 0; col < n; col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 'Q';
                count = count + backtrack(board, row + 1, n, res);
                board[row][col] = '.';
            }
        }
        return count;
    }

    private boolean isSafe(char [][]board, int row, int col, int n){
        for(int i = 0; i<row; i++){
            if(board[i][col] == 'Q')return false;
        }

        for(int i = row - 1, j = col - 1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q')return false;
        }

        for(int i = row -1, j= col + 1; i >= 0 && j<n; i--, j++){
            if(board[i][j] == 'Q')return false;
        }
        return true;
    }
}