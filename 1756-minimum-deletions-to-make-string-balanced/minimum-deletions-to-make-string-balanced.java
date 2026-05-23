class Solution {
    public int minimumDeletions(String s) {
        int count = 0;

        Stack<Character> stk = new Stack<>();

        for(char ch : s.toCharArray()){

            if(stk.isEmpty()){
                stk.push(ch);
            }

            else if(ch == 'a' && stk.peek() == 'b'){
                stk.pop();
                count++;
            }

            else{
                stk.push(ch);
            }
        }
        return count;
    }
}