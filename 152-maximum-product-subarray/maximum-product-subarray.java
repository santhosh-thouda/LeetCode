class Solution {
    public int maxProduct(int[] arr) {
        int prod  = 1;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            prod *= arr[i];
            max = Math.max(max, prod);
            if(prod == 0)prod = 1;
        } 

        prod = 1; 
        for(int i = arr.length - 1; i>=0; i--){ 
            prod *= arr[i]; 
            max = Math.max(max, prod); 
            if(prod == 0)prod = 1; 
        } 
        return max; 
    } 
} 