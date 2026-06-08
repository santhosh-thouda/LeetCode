class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] resultArr = new int[nums.length];

        int k = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                resultArr[k] = nums[i];
                k++;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 2 != 0){
                resultArr[k] = nums[i];
                k++;
            }
        }

        return resultArr;
    }
}