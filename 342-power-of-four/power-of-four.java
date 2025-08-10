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


        // n = 64 → divisible by 4 → n = 16
        // n = 16 → divisible by 4 → n = 4
        // n = 4  → divisible by 4 → n = 1
        // Reached 1 → true (64 = 4^3)
    }
}
