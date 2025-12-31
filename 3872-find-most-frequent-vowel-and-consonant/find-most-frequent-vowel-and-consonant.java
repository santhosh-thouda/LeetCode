class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowels = new HashMap<>();
        HashMap<Character, Integer> consonents = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vowels.put(s.charAt(i), vowels.getOrDefault(s.charAt(i), 0) + 1);
            }
            else{
                consonents.put(s.charAt(i), consonents.getOrDefault(s.charAt(i), 0)+1);
            }
        }
        int a = vowels.isEmpty() ? 0 : Collections.max(vowels.values());
        int b = consonents.isEmpty() ? 0 : Collections.max(consonents.values());

        return a + b;
    }
}