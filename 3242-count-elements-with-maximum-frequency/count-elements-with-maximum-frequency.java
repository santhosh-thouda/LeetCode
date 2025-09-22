class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[128];
        for(int num : nums){
            freq[num]++;
        }
        int maxFreq = 0;
        for(int f : freq){
            if(f > maxFreq){
                maxFreq = f;
            }
        }
        
        int total = 0;
        for(int f : freq){
            if(f == maxFreq){
                total += f;
            }
        }
        return total;
    }
}