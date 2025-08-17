class Solution {
    static int mod = 1000000007;
    public int countGoodNumbers(long n) {
        
        long evenCount = (n + 1)/2; //ceil value
        long oddCount = (n/2); // floor value

         // (5^evenCount * 4^oddCount) % MOD
        long res = (fastPow(5, evenCount, mod) * fastPow(4, oddCount, mod)) % mod;
        return (int)(res);
    }
    
    public long fastPow(long x, long n, int mod){
        if(n == 0)return 1;
        
        long half = fastPow(x, n/2, mod);
        long result = (half * half) % mod;
        
        if(n % 2 != 0){
            result = (result * x) % mod;
        }
        return result;
    }
}