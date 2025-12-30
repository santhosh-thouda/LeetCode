// import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n+1];

        for(int i : nums){
            if(i > 0 && i <= n){
                seen[i] = true;
            }
        }

        for(int i = 1; i<=n; i++){
            if(!seen[i]){
                return i;
            }
        }
        return n + 1;
    }
}
