class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length-1; i++){
            int diff = arr[i+1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }

        for(int i = 0; i<arr.length-1; i++){
            List<Integer> list = new ArrayList<>();
            if((arr[i+1] - arr[i]) == minDiff){
                list.add(arr[i]);
                list.add(arr[i+1]);
                result.add(list);
            }
        }
        return result;
    }
}