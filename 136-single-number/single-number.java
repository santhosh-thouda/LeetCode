class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        
        for(int num : nums){
            ans = ans ^ num;
        }
        return ans;
    }
}








