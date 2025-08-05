class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int m = num1.length;
        int n = num2.length;
        int newArr[] = new int[m + n];
        int k = 0;
        int i = 0, j = 0;

        while(i < m && j < n){
            if(num1[i] < num2[j]){
                newArr[k] = num1[i];
                i++;
            }
            else{
                newArr[k] = num2[j];
                j++;
            }
            k++;
        }

        while(i < m){
            newArr[k] = num1[i];
            i++;
            k++;
        }
        while(j < n){
            newArr[k] = num2[j];
            j++;
            k++;
        }

        int totalLen = m + n;
        if(totalLen % 2 == 1){
            return newArr[totalLen / 2];
        }
        else{
            return (newArr[totalLen / 2] + newArr[(totalLen / 2) - 1]) / 2.0;
        }
    }
}