class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left <= right){
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}