class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Arrays.stream(nums).max().getAsInt();
        
        int left = 1, right = max, result = max;

        while(left < right){
            int mid = left + (right-left)/2;
            if(possible(nums, mid, threshold)){
                result = mid;
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return result;
    }
    private static boolean possible(int nums[], int mid, int threshold){
        int sum = 0;
        for(int num : nums){
            sum += (num+mid-1)/mid;
            if(sum > threshold)return false;
        }
        return sum <= threshold;
    }
}