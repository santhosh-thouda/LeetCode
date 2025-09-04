class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())return false;
        //String doubled = s + s; // we join the first string 2 times, then we check to the 2nd string
        //for example : s = "abcde", goal = "cdeab", so now doubled = s+s, then it will be
        // doubled = "abcdeabcde";, we just need a small part from it, it is rotated correctly, we would
        // find the goal exactly
        return (s+s).contains(goal);
    }
}