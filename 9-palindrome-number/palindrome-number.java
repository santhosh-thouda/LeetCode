class Solution {
    public boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while(n > 0){
            //instead of creating int ld = n % 10, below were are just doing without ld seperately
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return temp == rev;
    }
}