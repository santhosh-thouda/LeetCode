class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        boolean[] merged = new boolean[n];
        List<int[]> result = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if(merged[i])continue;

            int start = intervals[i][0];
            int end = intervals[i][1];

            for(int j = i+1; j<n; j++){
                if(intervals[j][0] <= end){
                    end = Math.max(end, intervals[j][1]);
                    merged[j] = true;
                }
                else{
                    break;
                }
            }
            result.add(new int[]{start, end});
        }
        return result.toArray(new int[result.size()][]);
    }
}
