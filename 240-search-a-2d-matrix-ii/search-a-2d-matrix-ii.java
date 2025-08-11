class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        int currentRow = 0;
        int currentCol = totalCols - 1;

        while(currentRow < totalRows && currentCol >= 0){
            int value = matrix[currentRow][currentCol];

            if(value == target)return true;
            if(value > target) currentCol--;
            else currentRow++;
        }
        return false;
    }
}