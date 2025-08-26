class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;
        double maxArea = 0;

        for(int i = 0; i<dimensions.length; i++){
            int length = dimensions[i][0];
            int width = dimensions[i][1];

            double diagonal = Math.sqrt(length * length + width * width);
            int area = length * width;

            if(diagonal > maxDiagonal){
                maxDiagonal = diagonal;
                maxArea = area;
            }
            else if(diagonal == maxDiagonal && area > maxArea){
                maxArea = area;
            }
        }
        return(int) maxArea;
    }
}