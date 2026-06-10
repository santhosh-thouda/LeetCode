class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m + n];

        int i = 0, j = 0, k = 0;
        
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                result[k++] = nums1[i++];
            }
            else{
                result[k++] = nums2[j++];
            }
        }

        while(i < m){
            result[k++] = nums1[i++];
        }

        while(j < n){
            result[k++] = nums2[j++];
        }

        int totalLength = m + n;
        if(totalLength % 2 == 1)return result[totalLength/2];
        else return (result[totalLength/2] + result[totalLength/2 - 1])/2.0;
    }
}