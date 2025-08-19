class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long current = 0;
        long count = 0;
        
        for(int num : nums){
            if(num == 0){
                current++;
                count = count + current;
            }
            else{
                current = 0;
            }
        }
        return count;
    }
}