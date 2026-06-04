class Solution {
    public int totalWaviness(int num1, int num2) {
        int sum = 0;

        for(int i = num1; i <= num2; i++){
            String str = toString(i);
            sum = sum + findWaviness(str);
        }

        return sum;
    }

    public String toString(int num){
        return String.valueOf(num);
    }

    public int findWaviness(String str){
        
        int peak = 0;
        int valley = 0;

        if(str.length() < 3)return 0;

        for(int i = 1; i<str.length()-1; i++){
            int prevVal = str.charAt(i - 1) - '0';
            int nextVal = str.charAt(i + 1) - '0';
            int currentVal = str.charAt(i) - '0';

            if(currentVal > prevVal && currentVal > nextVal)peak++;
            else if(currentVal < prevVal && currentVal < nextVal)valley++;
        }

        return peak + valley;
    }
}