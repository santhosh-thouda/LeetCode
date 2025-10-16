class Solution {
    public int maxSubArray(int[] arr) {
        int currentMax = arr[0];
        int max = arr[0];

        for(int i = 1; i<arr.length; i++){
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            max = Math.max(max, currentMax);
        }
        return max;
    }
}