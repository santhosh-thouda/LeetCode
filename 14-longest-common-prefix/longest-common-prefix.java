class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)return "";

        // brute force approach
        for(int i = 0; i<strs[0].length(); i++){ // for first string
            char c = strs[0].charAt(i);
            for(int j = 1; j<strs.length; j++){ // for comparing all the strings
                if(i >= strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}