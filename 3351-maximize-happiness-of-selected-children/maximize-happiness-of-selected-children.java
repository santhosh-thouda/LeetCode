class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        Arrays.sort(happiness);

        if(k == 1)return happiness[n-1];
        long total = 0;
        int count = 0;
        for(int i = n-1; i>=0 && k > 0; i--){
            int value = happiness[i] - count;
            if(value <= 0)break;
            total += value;
            k--;
            count++;
        }
        return total;
    }
}
