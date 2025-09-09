class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt(); //minimum possible capacity is the max of all weights
        int right = Arrays.stream(weights).sum(); // maximum possible capacity is the sum of all the weights
        int result = right;
        while(left < right){
            int mid = left + (right-left)/2;
            if(possible(weights, mid, days)){
                result = mid;
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return result;
    }
    private static boolean possible(int[] weights, int mid, int days){
        int dayCount = 1, currentLoad = 0;

        for(int w : weights){
            if(currentLoad + w > mid){
                dayCount++;
                currentLoad = 0;
            }
            currentLoad += w;
            if(dayCount > days)return false;
        }
        return dayCount <= days;
    }
}