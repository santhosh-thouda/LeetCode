class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1)return false;
        return (n&(n-1)) == 0;  // bitwise multiplication for n 
        //suppose if n=8, n=1000 and n-1 = 0111 if we multiply both with & it will be 0000
        //suppose if n==1, n==0001 and n-1 = 0000, then it will be 0000 
    }
}