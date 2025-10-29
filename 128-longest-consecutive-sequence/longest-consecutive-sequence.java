class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int max = 0;

        for(int num : set){
            int currentNum = num;
            int count = 0;

            if(!set.contains(num - 1)){
                while(set.contains(currentNum + 1)){
                    currentNum++;
                    count++;
                }
                max = Math.max(count+1, max);
            }
        }
        return max;
    }
} 