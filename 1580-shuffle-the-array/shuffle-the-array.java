class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []ans = new int[nums.length];
        int left = 0;
        int right = n;
        int k = 0;
        while(left <= n-1 && right < nums.length){
            ans[k] = nums[left];
            left++;
            k++;
            ans[k] = nums[right];
            right++;
            k++;
        }
        return ans;
    }
}