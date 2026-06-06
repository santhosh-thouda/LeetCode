class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        int sum1 = 0;
        for(int i = 0; i<n; i++){
            leftSum[i] = sum1;
            sum1 = sum1 + nums[i];
        }

        int sum2 = 0;
        for(int i = n-1; i>=0; i--){
            rightSum[i] = sum2;
            sum2 = sum2 + nums[i];
        }

        for(int i = 0; i<n; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }

        return -1;
    }
}