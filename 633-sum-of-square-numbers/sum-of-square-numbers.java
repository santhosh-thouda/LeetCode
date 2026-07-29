class Solution {
    public boolean judgeSquareSum(int c) {
        
        int left = 0;
        int right = (int)Math.floor(Math.sqrt(c));

        while(left <= right){
            long sum = 1L * left * left + 1L * right * right;

            if(sum == c){
                return true;
            }
            else if(sum > c){
                right--;
            }
            else{
                left++;
            }
        }

        return false;
    }
}