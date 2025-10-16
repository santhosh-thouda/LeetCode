class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos = 0;
        int neg = 1;
        int[] numbers = new int[n];

        for(int i = 0; i<n; i++){
            if(nums[i] > 0){
                numbers[pos] = nums[i];
                pos+=2;
            }
            else if(nums[i] < 0){
                numbers[neg] = nums[i];
                neg += 2;
            }
        } 
        return numbers;
    }
}