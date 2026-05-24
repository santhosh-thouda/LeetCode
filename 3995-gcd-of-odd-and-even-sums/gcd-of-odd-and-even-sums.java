class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n * n;
        int sumEven = n * (n + 1);

        while(sumOdd != 0 && sumEven != 0){
            if(sumOdd > sumEven){
                sumOdd = sumOdd % sumEven;
            }
            else{
                sumEven = sumEven % sumOdd;
            }
        }
        return (sumOdd == 0) ? sumEven : sumOdd;
    }
}