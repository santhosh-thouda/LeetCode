class Solution {
    public double myPow(double x, int n) {
        if(n < 0){
            x = 1/x;
            n = -(-n);
        }
        return fastPow(x, n);
    }
    private static double fastPow(double x, int n){
        if(n == 0)return 1;
        double half = fastPow(x, n/2);
        if(n % 2 == 0)return half * half;
        else return x * half * half;
    }
}