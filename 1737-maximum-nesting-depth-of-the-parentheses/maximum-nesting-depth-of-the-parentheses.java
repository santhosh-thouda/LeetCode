class Solution {
    public int maxDepth(String s) {
        Stack<Character> stk = new Stack<>();
        int currentMax = 0;
        int totalMax = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stk.push(s.charAt(i));
            }
            currentMax = Math.max(currentMax, stk.size());
            totalMax = Math.max(currentMax, totalMax);
            if(s.charAt(i) == ')'){
                stk.pop();
            }
        }
        return totalMax;
    }
}