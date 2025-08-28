class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i = 0; i<n; i++){
            if(map.get(nums[i]) > n/3 && !result.contains(nums[i])){
                result.add(nums[i]);
            }
        }
        return result;
    }
}