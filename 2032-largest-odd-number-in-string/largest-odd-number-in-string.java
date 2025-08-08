class Solution {
    public String largestOddNumber(String nums){
        int n = nums.length() - 1;

        while(n >= 0){
            int c = nums.charAt(n) - '0';
            if(c %2 != 0){
                return nums.substring(0, n+1);
            }
            n--;
        }
        return "";
    }
}