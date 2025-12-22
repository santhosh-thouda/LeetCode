class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = height.length - 1;
        int maxArea = Math.min(height[left], height[right]);

        while(left <= right){
            int width = right - left ;
            int currentArea = width * Math.min(height[left], height[right]);

            if(height[left] < height[right]){    
                currentArea = width * height[left];
                left++;
            }
            else{
                currentArea = width * height[right];
                right--;
            }
            maxArea = Math.max(maxArea, currentArea);
        }
        return maxArea;
    }
} 