class Solution {
    public boolean isValid(String str) {
        Stack <Character> st = new Stack<>();

        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            else if(c == ')' && (st.isEmpty() || st.pop() != '(')){
                return false;
            }
            else if(c == '}' && ( st.isEmpty() || st.pop() != '{')){
                return false;
            }
            else if(c == ']' && ( st.isEmpty() || st.pop() != '[')){
                return false;
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}
