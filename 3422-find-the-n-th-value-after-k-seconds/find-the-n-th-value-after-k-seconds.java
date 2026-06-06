class Solution {
    public int valueAfterKSeconds(int n, int k) {
        
        int[] prefixSum = new int[n];
        int MOD = 1000000007;

        for(int i = 0; i<n; i++){
            prefixSum[i] = 1;
        }

        int max = 0;

        for(int i = 1; i<=k; i++){
            for(int j = 1; j<n; j++){
                prefixSum[j] = (prefixSum[j] + prefixSum[j - 1]) % MOD;
            }
        }

        return prefixSum[n-1];
    }
}