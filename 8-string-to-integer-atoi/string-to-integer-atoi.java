class Solution {
    public int myAtoi(String s) {
        String s1 = s.trim();
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int i = 0;
        int sign = 1;
        long num = 0;
        int n = s1.length();

        if(s1.isEmpty())return 0;
        if(s1.charAt(i) == '-' || s1.charAt(i) == '+'){
            sign = (s1.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while(i < n && Character.isDigit(s1.charAt(i))){
            num = num * 10 + (s1.charAt(i) - '0'); // in ascii code '0'=48
            if(num * sign > max)return max;
            if(num * sign < min)return min;
            i++;
        } 
        return (int)(sign*num);
    }
}
