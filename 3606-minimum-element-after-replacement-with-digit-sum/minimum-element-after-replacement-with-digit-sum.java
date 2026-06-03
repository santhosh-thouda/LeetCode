class Solution {
    public int minElement(int[] nums) {
        int[] sumArr = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            int val = nums[i];
            int sum = 0;

            while(val > 0){
                int ld = val % 10;
                sum = sum + ld;
                val = val / 10;
            }

            sumArr[i] = sum;
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            min = Math.min(min, sumArr[i]);
        }

        return min;
    }
}