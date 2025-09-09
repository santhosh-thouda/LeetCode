import java.math.BigInteger; // Import BigInteger class from java.math package

class Solution {
    public String addBinary(String a, String b) {
        // Convert string 'a' (binary representation) into a BigInteger (base 2)
        BigInteger c = new BigInteger(a, 2);

        // Convert string 'b' (binary representation) into a BigInteger (base 2)
        BigInteger d = new BigInteger(b, 2);

        // Add the two BigInteger values
        BigInteger sum = c.add(d);

        // Convert the result back to a binary string (radix 2) and return
        return sum.toString(2);
    }
}
