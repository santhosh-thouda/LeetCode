class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int n = nums.length;
        int len = 0;

        for(int i = 0; i<n; i++){
            int zeroes = 0;
            for(int j = i; j<n; j++){
                if(nums[j] == 0){
                    zeroes++;
                }
                if(zeroes <= k){
                    len = j - i + 1;
                    maxLen = Math.max(maxLen, len);
                }
                else{
                    break;
                }
            }
        }
        return maxLen;
    }
}