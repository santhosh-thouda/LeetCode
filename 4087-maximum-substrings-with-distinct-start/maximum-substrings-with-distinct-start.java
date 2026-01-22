class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            set.add(ch);
        }

        return set.size();
    }
}