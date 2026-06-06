class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i<nums.length; i++){
            leftSum[i] = sum1;
            sum1 = sum1 + nums[i];
        }

        for(int i = nums.length-1; i>=0; i--){
            rightSum[i] = sum2;
            sum2 = sum2 + nums[i];
        }

        int[] resultArr = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            resultArr[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return resultArr;
    }
} 