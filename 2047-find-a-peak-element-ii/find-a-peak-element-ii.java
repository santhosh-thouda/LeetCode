class Solution {
    public int[] findPeakGrid(int[][] matrix) {
        
        int a = 0;
        int b = 0;

        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int maxVal = 0;

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(matrix[i][j] >= maxVal){
                    maxVal = matrix[i][j];
                    a = i;
                    b = j;
                }
            }
        }

        return new int[]{a, b};
    }
}