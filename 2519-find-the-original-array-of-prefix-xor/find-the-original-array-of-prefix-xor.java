class Solution {
    public int[] findArray(int[] pref) {
        int[] prefArr = new int[pref.length];

        prefArr[0] = pref[0];

        for(int i = 1; i < pref.length; i++){
            prefArr[i] = pref[i] ^ pref[i - 1];
        }

        return prefArr;
    }
}