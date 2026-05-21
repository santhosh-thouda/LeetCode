class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }
        
        int[] newArr = new int[list.size()];
        for(int i = 0; i<newArr.length; i++){
            newArr[i] = list.get(i);
        }
        return newArr;
    }
}