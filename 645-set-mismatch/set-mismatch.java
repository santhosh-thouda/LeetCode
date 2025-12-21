class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1;
        int missing = -1;

        for(int i = 0; i<n; i++){
            int index = nums[i] > 0 ? nums[i] - 1 : -nums[i] - 1;

            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
            else{
                duplicate = index + 1;
            }
        }

        for(int i = 1; i<=n; i++){
            if(nums[i-1] > 0){
                missing = i;
                break;
            }
        }
        
        return new int[]{duplicate, missing};
    }
}