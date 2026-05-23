class Solution {
    public boolean checkString(String s) {
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'b'){
                count++;
            }
            if(count > 0 && s.charAt(i) == 'a'){
                return false;
            }
        }
        return true;
    }
}