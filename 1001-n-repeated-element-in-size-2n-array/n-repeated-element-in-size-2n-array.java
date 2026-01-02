class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        int max = nums[0];

        for(int i = 0; i<n; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        int[] freq = new int[max+1];

        for(int i = 0; i<n; i++){
            freq[nums[i]]++;
        }

        for(int i = 0; i<freq.length; i++){
            if(freq[i] >= (n/2)){
                return i;
            }
        }

        return 0;
    }
}