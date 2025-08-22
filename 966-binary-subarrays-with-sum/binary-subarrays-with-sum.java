class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    private int atMost(int[]nums, int goal){
        int n = nums.length;
        int l = 0, r = 0, sum = 0, count = 0;
        
            if(goal < 0)return 0;
            while(r < n){
                sum += nums[r];
                while(sum > goal){
                    sum = sum - nums[l];
                    l++;
                }
                count += (r-l+1);
                r++;
            }

        return count;
    }
}