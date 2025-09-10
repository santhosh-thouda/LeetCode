class Solution {
    public int findKthPositive(int[] arr, int k) {
        // Linear Search Algorithm
        int max = Arrays.stream(arr).max().getAsInt() + k;
        int[] arr1 = new int[max];
        int j = 0;
        for(int i = 1; i<=max; i++){
            boolean found = false;
            for(int a : arr){
                if(i == a){
                    found = true;
                    break;
                }
            }
            
            if(!found){
                arr1[j] = i;
                j++;
                if(j == k){
                    return arr1[j - 1]; // because j is taken as 0
                }
            }
        }
        return -1;
    }
}