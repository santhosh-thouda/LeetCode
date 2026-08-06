class Solution {
    public int smallestNumber(int n, int t) {
        int i = n;

        while(productOfDigits(i) % t != 0){
            i++;
        }

        return i;
    }

    public int productOfDigits(int n){
        int prod = 1;

        while(n > 0){
            int ld = n % 10;
            prod = prod * ld;
            n = n / 10;
        }

        return prod;
    }

}