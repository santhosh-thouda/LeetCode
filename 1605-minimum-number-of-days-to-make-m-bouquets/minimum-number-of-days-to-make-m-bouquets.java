class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long)m*k;
        if(val > bloomDay.length)return -1;
        int max = Arrays.stream(bloomDay).max().getAsInt();
        int min = Arrays.stream(bloomDay).min().getAsInt();
        int n = bloomDay.length;
        int result = 0;

        if(n < m*k)return -1;

        while(min <= max){
            int mid = min + (max - min)/2;
            boolean yesOrNo = possible(bloomDay, mid, m, k);
            if(yesOrNo){
                result = mid;
                max = mid - 1;
            }
            else{
                min = mid + 1;
            }
        }
        return result;
    }

    private static boolean possible(int arr[], int day, int m, int k){
        int n = arr.length;
        int count = 0, noOfBouquets = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] <= day){
                count++;
            }
            else{
                noOfBouquets += (count/k);
                count = 0;
            }
        }
        noOfBouquets += (count/k);

        return noOfBouquets >= m;
    }
}