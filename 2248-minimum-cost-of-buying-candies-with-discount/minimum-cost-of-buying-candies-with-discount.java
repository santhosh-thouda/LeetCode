class Solution {
    public int minimumCost(int[] cost) {
        int sum = 0;
        int n = cost.length;

        Arrays.sort(cost);
        int count = 0;

        for(int i = n-1; i>=0; i--){ 
            if(count < 2){
                sum += cost[i];
            }

            count++;

            if(count == 3){
                count = 0;
            }
        }

        return sum;
    }
}