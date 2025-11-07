class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(resultList, new ArrayList<>(), nums, used);
        return resultList;
    } 
    private void backtrack(List<List<Integer>> resultList, ArrayList<Integer>tempList, int[] nums, boolean used[]){
        if(tempList.size() == nums.length){
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(used[i])continue;
            used[i] = true;
            tempList.add(nums[i]);
            backtrack(resultList, tempList, nums, used);
            tempList.remove(tempList.size() - 1);
            used[i] = false;
        }
    }
} 