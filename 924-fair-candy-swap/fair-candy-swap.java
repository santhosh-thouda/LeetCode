class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        HashSet<Integer> setB = new HashSet<>();
        int[] ans = new int[2];

        int sum1 = 0;
        for(int i : aliceSizes){
            sum1 += i;
        }

        int sum2 = 0;
        for(int i : bobSizes){
            setB.add(i);
            sum2 += i;
        }

        int difference = (sum2 - sum1)/2;
        
        for(int i : aliceSizes){
            if(setB.contains(i + difference)){
                ans[0] = i;
                ans[1] = i + difference;
                return ans;
            }
        } 
        return new int[]{};
    }
} 