class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack <Integer> st = new Stack<>();

        for(int i = 0; i<n; i++){
            String token = tokens[i];
            if(!token.equals("*") && !token.equals("/") && !token.equals("+") && !token.equals("-")){
                int k = Integer.parseInt(token);
                st.push(k);
            } 
            else{
                    int b = st.pop();
                    int a = st.pop();

                switch(token){
                    case "+":
                        st.push(a+b);
                        break;
                    case "-":
                        st.push(a-b);
                        break;
                    case "*":
                        st.push(a*b);
                        break;
                    case "/":
                        st.push(a/b);
                        break;
                }
            }
        }
        return st.pop();
    }
}