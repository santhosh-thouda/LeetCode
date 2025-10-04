import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int total = 0;
        int prevValue = 0;

        for(int i = s.length()-1; i>=0; i--){
            int currentValue = map.get(s.charAt(i));
            if(prevValue > currentValue){
                total = total - currentValue;
            }
            else{
                total = total + currentValue;
            }
            prevValue = currentValue;
        }
        return total;
    }
}
