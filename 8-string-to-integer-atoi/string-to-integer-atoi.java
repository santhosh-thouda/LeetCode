class Solution {
    public int myAtoi(String s) {
        String s1 = s.trim();
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
            if(num * sign > Integer.MAX_VALUE)return Integer.MAX_VALUE;
            if(num * sign < Integer.MIN_VALUE)return Integer.MIN_VALUE;
            i++;
        } 
        return (int)(sign*num);
    }
}
