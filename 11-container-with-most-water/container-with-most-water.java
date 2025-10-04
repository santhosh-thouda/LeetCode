class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = height.length - 1;
        int maxArea = Math.min(height[left], height[right]);

        while(left <= right){
            int width = right - left;
            int length = Math.min(height[left], height[right]);
            int area = width * length;
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