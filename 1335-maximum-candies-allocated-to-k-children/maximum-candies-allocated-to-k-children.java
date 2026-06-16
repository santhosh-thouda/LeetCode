class Solution {
    public int maximumCandies(int[] candies, long k) {

        int max = Integer.MIN_VALUE;

        for(int i = 0; i<candies.length; i++){
            max = Math.max(max, candies[i]);
        }
        
        int left = 1;
        int right = max;

        int ans = 0;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(countChildren(candies, mid) >= k){
                ans = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return ans;
    }

    public long countChildren(int[] candies, int candy){
        long children = 0;

        for(int pile : candies){
            children += pile/candy;
        }
        return children;
    }
}