class Solution {
    public int[] rowAndMaximumOnes(int[][] matrix) {

        int row = 0;
        int maxOnes = 0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {

            Arrays.sort(matrix[i]);

            int firstOne = lowerBound(matrix[i], 1);
            int count = cols - firstOne;

            if (count > maxOnes) {
                maxOnes = count;
                row = i;
            }
        }

        return new int[]{row, maxOnes};
    }

    private int lowerBound(int[] arr, int x) {

        int low = 0;
        int high = arr.length;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}