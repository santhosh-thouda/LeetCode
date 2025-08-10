class Solution {
    public boolean isPowerOfFour(int n) {
        // Powers of four are positive integers only
        if (n < 1) return false;

        // Keep dividing n by 4 while it is perfectly divisible
        while (n % 4 == 0) {
            n = n / 4; // reduce the number by factor of 4
        }

        // If after full division we reach exactly 1 → it was a power of four
        return n == 1;

    }
}
