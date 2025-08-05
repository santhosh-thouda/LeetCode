class Solution {
    public boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return temp == rev;
    }
}