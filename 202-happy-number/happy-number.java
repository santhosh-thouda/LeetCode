class Solution {
    public boolean isHappy(int n) {
        int sum;

        while(n != 1 && n != 4){
            sum = 0;
            while(n != 0){
                int ld = n % 10;
                sum += ld * ld;
                n = n/10;
            }
            n = sum;
        }
        return n == 1;
    }
} 