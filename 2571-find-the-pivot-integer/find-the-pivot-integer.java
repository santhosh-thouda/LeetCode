class Solution {
    public int pivotInteger(int n) {
        if(n==1)return 1;
        int totalSum = n*(n+1)/2;

        int left = 0;

        for(int i = 1; i<=n; i++){
            left = left + i;
            if(left == totalSum - left +i)return i;
        }

        return -1;
    }
}
