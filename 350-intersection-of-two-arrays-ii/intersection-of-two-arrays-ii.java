class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for(int x : nums1){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(int x : nums2){
            if(map.containsKey(x) && map.get(x) > 0){
                res.add(x);
                map.put(x, map.get(x) - 1);
            }
        }

        int[] ans = new int[res.size()];
        int i = 0;
        for(int x : res){
            ans[i++] = x;
        }
        
        return ans;
    }
}