class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            int charVal = s.charAt(i) - 'a' + 1;
            sb.append(charVal);
        }

        int result = digitSum(sb.toString());

        for(int i = 1; i<k; i++){
            result = digitSum(String.valueOf(result));
        }
        return result;
    }

    public int digitSum(String str){
        int sum = 0;

        for(int i = 0; i<str.length(); i++){
            sum = sum + str.charAt(i) - '0';
        }

        return sum;
    }
}