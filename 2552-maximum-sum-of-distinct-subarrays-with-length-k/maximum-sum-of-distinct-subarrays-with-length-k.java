import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n < k) return 0;  // If the array is smaller than k, return 0

        long windowSum = 0;  // To store the sum of current window
        long maxSum = 0;     // To store the maximum sum found
        int left = 0;        // Left pointer for the sliding window
        HashSet<Integer> set = new HashSet<>();  // To keep track of distinct elements in the window

        // Loop through the array with the right pointer
        for (int right = 0; right < n; right++) {
            // If the current number is already in the set, 
            // remove numbers from the left side until it's not
            while (set.contains(nums[right])) {
                set.remove(nums[left]);         // Remove the leftmost element from the set
                windowSum -= nums[left];        // Subtract it from the window sum
                left++;                         // Move the left pointer forward
            }

            // Add the current number to the set and sum
            set.add(nums[right]);
            windowSum += nums[right];

            // If the window has exactly k distinct elements
            if (set.size() == k) {
                // Update the maximum sum if this window's sum is bigger
                maxSum = Math.max(maxSum, windowSum);

                // Shrink the window from the left to check the next window
                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }
        }

        // Return the maximum sum found
        return maxSum;
    }
}
