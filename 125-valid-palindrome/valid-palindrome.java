class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left <= right){
            while(left <= right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left <= right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(left > right){
                break;
            }

            char lc = Character.toLowerCase(s.charAt(left));
            char rc = Character.toLowerCase(s.charAt(right));
            
            if(lc != rc){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}