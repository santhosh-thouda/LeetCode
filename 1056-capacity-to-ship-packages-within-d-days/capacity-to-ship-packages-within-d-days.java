class Solution {
    public int shipWithinDays(int[] weights, int days) {

        // min possible capacity would be max value of all the values
        int min = 0;
        for(int i = 0; i<weights.length; i++){
            min = Math.max(min, weights[i]);
        }

        // max possible capacity would be sum of all values in weights
        int max = 0;
        for(int i = 0; i<weights.length; i++){
            max = max + weights[i];
        }

        int left = min;
        int right = max;
        int ans = 0;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(possible(weights, mid, days)){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }

    public boolean possible(int[] weights, int mid, int days){
        int daysCount = 1;
        int currentLoad = 0;

        for(int w : weights){
            if(currentLoad + w > mid){
                daysCount++;
                currentLoad = 0;
            }
            currentLoad += w;
            if(daysCount > days)return false;
        }

        return daysCount <= days;
    }
}
