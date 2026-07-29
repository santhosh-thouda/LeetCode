class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> stk1 = new Stack<>();
        Stack <Character> stk2 = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '#'){
                if(!stk1.isEmpty()){
                    stk1.pop();
                }
            }
            else{
                stk1.push(ch);
            }
        }

        for(char ch : t.toCharArray()){
            if(ch == '#'){
                if(!stk2.isEmpty()){
                    stk2.pop();
                }
            }
            else{
                stk2.push(ch);
            }
        }

        StringBuilder sb1 = new StringBuilder();
        for(char ch : stk1){
            sb1.append(ch);
        }

        StringBuilder sb2 = new StringBuilder();
        for(char ch : stk2){
            sb2.append(ch);
        }

        return sb1.toString().equals(sb2.toString());
    }
}