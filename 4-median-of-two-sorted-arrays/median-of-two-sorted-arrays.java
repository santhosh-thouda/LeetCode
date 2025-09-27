class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int []newArr = new int[m+n];
        int i = 0, j = 0, k = 0;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                newArr[k++] = nums1[i++];
            }
            else{
                newArr[k++] = nums2[j++];
            }
        }
        while(i < m){
            newArr[k++] = nums1[i++];
        }
        while(j < n){
            newArr[k++] = nums2[j++];
        }

        int totalLength = m + n;
        if(totalLength % 2 == 1){
            return newArr[totalLength / 2];
        }
        else{
            return (newArr[totalLength/2] + newArr[totalLength/2 - 1])/2.0;
        }
    }
}
