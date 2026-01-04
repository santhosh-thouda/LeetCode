class Solution {
    public int findDuplicate(int[] nums) {
        
        int max = nums[0];

        for(int i = 0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        
        int[]freq = new int[max + 1];

        for(int i = 0; i<nums.length; i++){
            freq[nums[i]]++;
        }

        for(int i = 0; i<freq.length; i++){
            if(freq[i] > 1){
                return i;
            }
        }
        
        return -1;
    }
}