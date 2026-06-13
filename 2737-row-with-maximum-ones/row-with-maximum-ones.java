class Solution {
    public int[] rowAndMaximumOnes(int[][] matrix) {
        
        int a = 0;
        int b = 0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int count = 0;

        for(int i = 0; i<rows; i++){
            count = 0;
            for(int j = 0; j<cols; j++){
                if(matrix[i][j] == 1){
                    count++;
                }
            }
            if(count > b){
                a = i;
                b = count;
            }
        }

        return new int[]{a, b};
    }
}