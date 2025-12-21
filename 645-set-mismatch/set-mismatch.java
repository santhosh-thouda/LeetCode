class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1;
        int missed = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i<=n; i++){
            map.put(nums[i-1], map.getOrDefault(nums[i-1], 0) + 1);

            if(map.get(nums[i-1]) == 2){
                duplicate = nums[i-1];
            };
        }

        for(int i = 1; i<=n; i++){
            if(!map.containsKey(i)){
                missed = i;
            }
        }

        return new int[]{duplicate, missed};
    }
}