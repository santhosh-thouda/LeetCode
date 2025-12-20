class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet <Integer> set = new HashSet<>();
        int total = n * n;

        int repeated = 0;
        int missing = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                int val = grid[i][j];
                map.put(val, map.getOrDefault(val, 0) + 1);

                if(map.get(val) == 2)repeated = val;
                set.add(val);
            }
            
        }
        for(int i = 1; i<=total; i++){
            if(!set.contains(i)){
                missing = i;
                break;
            }
        }
        return new int[]{repeated, missing};
    }
}