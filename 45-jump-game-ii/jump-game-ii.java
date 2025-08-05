class Solution {
    public int jump(int[] nums) {
        int maxIndex = 0;
        int far = 0;
        int currentIndex = 0;
            for(int i = 0; i<nums.length-1; i++){
                if(i > maxIndex){
                    return -1;
                }
                maxIndex = Math.max(maxIndex, i + nums[i]);

                if(i == currentIndex){
                    far++;
                    currentIndex = maxIndex;
                }
            }
        return far;
    }
}