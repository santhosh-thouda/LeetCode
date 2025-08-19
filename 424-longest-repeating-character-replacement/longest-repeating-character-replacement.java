class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int maxWindow = 0;
        int []freq = new int[26];

        for(int right = 0; right < s.length(); right++){
            freq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

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