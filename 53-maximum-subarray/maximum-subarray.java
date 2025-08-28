class Solution {
    public int maxSubArray(int[] arr) {
        int currentMax = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i<arr.length; i++){
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSum = Math.max(maxSum, currentMax);
        }
        return maxSum;
    }
} 