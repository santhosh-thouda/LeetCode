class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int hello = nums[n-k];
        return hello;
    }
}