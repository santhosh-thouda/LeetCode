class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        
        for(int i = 1; i<nums.length; i++){
            if(i == 0){
                prefixSum[i] = 1;
            }
            prefixSum[i] = nums[i] + prefixSum[i - 1];
        }

        return prefixSum;
    }
}