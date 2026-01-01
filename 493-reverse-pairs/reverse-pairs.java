class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int countPairs(int[] arr, int left, int mid, int right){
        int j = mid + 1;
        int count = 0;

        for(int i = left; i<= mid; i++){
            while(j <= right && ((long)arr[i] > 2L * arr[j])){
                j++;
            }
            count += j - (mid + 1);
        }
        return count;
    }

    private int mergeSort(int[] arr, int left, int right){
        if(left >= right)return 0;
        int count = 0;
        if(left < right){
            int mid = left + (right - left)/2;
            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += countPairs(arr, left, mid, right);
            merge(arr, left, mid, right);
        }
        return count;
    }

    private void merge(int[] arr, int left, int mid, int right){
        int i = left, j = mid + 1;
        int k = 0;
        int[] temp = new int[right - left + 1];

        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= right){
            temp[k++] = arr[j++];
        }

        for(int x = 0; x < temp.length; x++){
            arr[left + x] = temp[x];
        }
    }
} 