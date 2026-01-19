class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for(char c : jewels.toCharArray()){
            set.add(c);
        }

        for(char c : stones.toCharArray()){
            if(set.contains(c)){
                count++;
            }
        }
        return count;
    }
}