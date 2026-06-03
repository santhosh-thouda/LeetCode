class Solution {
    public int mySqrt(int n) {
        int sqrt = 0;
        for(int i = 0; (long) i*i <= n; i++){
            sqrt = i;
        }
        return sqrt;
    }
}