class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int k = 0;
        for(int i = 0; i<nums.length; i++){
            int freq = map.getOrDefault(nums[i], 0);
            if(freq < 2){
                nums[k] = nums[i];
                k++;
                map.put(nums[i], freq + 1);
            }
        }
        
        return k;
    }
}