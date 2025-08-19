class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int maxWindow = 0;
        int []freq = new int[26];

        for(int right = 0; right < s.length(); right++){
            //update the freq of current character
            freq[s.charAt(right) - 'A']++;

            // update the max freq
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // if the windowLen - maxFreq > k, then it will  
            // start shrinking the window from left (sliding window)
            int windowLen = right - left + 1;
            if((windowLen - maxFreq) > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            windowLen = right - left + 1;
            maxWindow = Math.max(maxWindow, windowLen);
        }
        return maxWindow;
    }
}