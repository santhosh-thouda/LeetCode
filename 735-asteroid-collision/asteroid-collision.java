class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> stk = new Stack<>();
        for(int asteroid : asteroids){
            while(!stk.isEmpty() && stk.peek() > 0 && asteroid < 0){
                int top = stk.peek();

                // this is for checking if peek is smaller then current negatively moving asteroid
                // then we pop the current
                // suppose top = 5, current asteroid = -6, then we check (5 < -(-6)) it is 5 < 6
                if(top < -asteroid){
                    stk.pop();
                    continue;
                }
                //this is for checking if they are equal
                // suppose top == 5, and current asteroid = -5
                // then top == -asteroid (5 == -(-5)) = (5 == 5)
                else if(top == -asteroid){
                    stk.pop();
                }
                // if collision occured, then we make that blasted asteroid as 0
                asteroid = 0;
                break;
            } 
            if(asteroid != 0){
                stk.push(asteroid);
            }
        } 
        int[] res = new int[stk.size()];
        for(int i = res.length-1; i>=0; i--){
            res[i] = stk.pop();
        }
        return res;
    }
} 