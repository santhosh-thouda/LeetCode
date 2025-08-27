class Solution {
    public void nextPermutation(int[] arr) {
        int pivot = -1;
        int n = arr.length;
        
        for(int i = n-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            reverseArray(arr, 0, n-1);
            return;
        }

        for(int i = n-1; i>=0; i--){
            if(arr[i] > arr[pivot]){
                swap(arr, i, pivot);
                break;
            }
        }
        reverseArray(arr, pivot + 1, n - 1);
    }

    private void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverseArray(int arr[], int i, int j){
        while(i <= j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}