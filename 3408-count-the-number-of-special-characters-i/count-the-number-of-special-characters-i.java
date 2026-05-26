class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;

        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i<word.length(); i++){
            set.add(word.charAt(i));
        }

        for(char ch = 'a'; ch<='z'; ch++){
            if(set.contains(ch) && set.contains(Character.toUpperCase(ch))){
                count++;
            }
        }

        return count;
    }
}