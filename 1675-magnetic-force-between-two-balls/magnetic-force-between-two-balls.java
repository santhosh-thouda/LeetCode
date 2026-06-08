class Solution {
    public int maxDistance(int[] position, int m) {
        
        Arrays.sort(position);

        int left = 1;
        int right = position[position.length - 1] - position[0];

        int ans = 0;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(canWePlace(position, mid, m)){
                ans = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return ans;
    }

    public boolean canWePlace(int[] position, int distance, int m){
        int count = 1;
        int last = position[0];

        for(int i = 1; i<position.length; i++){
            if(position[i] - last >= distance){
                count++;
                last = position[i];
            }
        }

        return count >= m;
    }
}