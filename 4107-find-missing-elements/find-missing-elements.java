class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            min = Math.min(num, min);
            max = Math.max(num, max);
            set.add(num);
        }

        for(int i = min; i<max; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }

        return result;
    }
}