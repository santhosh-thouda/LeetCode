class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int i = 0;
        int j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;

        int n = n1 + n2;
        
        int index2 = n/2;
        int index1 = index2-1;

        int indexOneEle = -1;
        int indexTwoEle = -1;

        int count = 0;

        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                if(count == index1) indexOneEle = nums1[i];
                if(count == index2) indexTwoEle = nums1[i];
                i++;
                count++;
            }
            else{
                if(count == index1) indexOneEle = nums2[j];
                if(count == index2) indexTwoEle = nums2[j];
                j++;
                count++;
            }
        }

        while(i < n1){
            if(count == index1) indexOneEle = nums1[i];
            if(count == index2) indexTwoEle = nums1[i];
            i++;
            count++;
        }

        while(j < n2){
            if(count == index1) indexOneEle = nums2[j];
            if(count == index2) indexTwoEle = nums2[j];
            j++;
            count++;
        }

        return (n % 2 == 1) ? indexTwoEle : (indexOneEle + indexTwoEle)/2.0;

    }
}