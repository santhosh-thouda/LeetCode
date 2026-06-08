class Solution {
    public int splitArray(int[] nums, int k) {
        
        // min possible value can be max value of nums
        int min = 0;
        for(int n : nums){
            min = Math.max(min, n);
        }

        int max = 0;
        for(int n : nums){
            max += n;
        }

        int left = min;
        int right = max;
        int ans = 0;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(possible(nums, mid, k)){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }

    public boolean possible(int[] nums, int mid, int k){
        int count = 1;
        int currentSum = 0;

        for(int n : nums){
            if(currentSum + n > mid){
                count++;
                currentSum = 0;
            }
            currentSum += n;
            if(count > k)return false;
        }
        
        return count <= k;
    }
}