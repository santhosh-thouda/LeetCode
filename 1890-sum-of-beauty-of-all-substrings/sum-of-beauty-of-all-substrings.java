class Solution {
    public int beautySum(String s) {
        int sum = 0;

        for(int i = 0; i<s.length(); i++){
            int[] freq = new int[26];
            for(int j = i; j<s.length(); j++){
                freq[s.charAt(j) - 'a']++;

                int currentMax = Integer.MIN_VALUE;
                int currentMin = Integer.MAX_VALUE;
                
                for(int k = 0; k<26; k++){
                    if(freq[k] > 0){
                        currentMin = Math.min(currentMin, (freq[k]));
                        currentMax = Math.max(currentMax, (freq[k]));
                    }
                }
                sum = sum + (currentMax - currentMin);
            }
        }
        return sum;
    }
}