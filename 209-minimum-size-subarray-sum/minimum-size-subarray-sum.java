class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left = 0;
        int right = 0;
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        while(right < n){
            sum += nums[right];

            while(sum >= target){
                sum -= nums[left];
                minLen = Math.min(minLen, right - left + 1);
                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}