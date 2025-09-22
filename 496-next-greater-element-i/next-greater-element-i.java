import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack <Integer> stk = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums2){
            while(!stk.isEmpty() && stk.peek() < num){
                map.put(stk.pop(), num);
            }
            stk.push(num);
        }

        int[] res = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }
} 