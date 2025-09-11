class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())return false;

        HashMap<Character, Character>map = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char c1 = s.charAt(i); //original string
            char c2 = t.charAt(i); //replacement string

            if(!map.containsKey(c1)){
                if(!map.containsValue(c2)){
                    map.put(c1, c2);
                }
                else{
                    return false; 
                } 
            } 
            else{ 
                char mappedChar = map.get(c1); 
                if(mappedChar != c2){ 
                    return false; 
                } 
            } 
        } 
        return true; 
    } 
} 