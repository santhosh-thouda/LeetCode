class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 1) return false;    // Powers of 3 are positive only
        while (n % 3 == 0) {       // Keep dividing by 3
            n /= 3;
        }
        return n == 1;             // Only a pure power of 3 will reduce to 1
    }
    // n = 27 → 27/3=9 → 9/3=3 → 3/3=1 → true
    // n = 45 → 45/3=15 → 15%3 != 0 → false
}