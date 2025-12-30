class Solution {
    public int firstMissingPositive(int[] nums) {
        int smallestNum = 1;

        Arrays.sort(nums);

        for(int num : nums){
            if(num == smallestNum){
                smallestNum++;
            }
        }
        return smallestNum;
    }
}
