class Solution {
    public int pivotInteger(int n) {
        if(n==1)return 1;
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 1; i<=n; i++){
            sum1 = sum1 + i;

            sum2 = 0;
            for(int j = i; j<=n; j++){
                sum2 = sum2 + j;
            }
            if(sum1 == sum2)return i;
        }

        return -1;
    }
}
