class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            int val = map.getOrDefault(nums[i], 0);
            map.put(nums[i], val+1);
        }
        for(int i = 0; i<n; i++){
            if(map.getOrDefault(nums[i], 0) == 1)return nums[i];
        }
        return -1;
    }
}








