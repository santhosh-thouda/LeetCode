class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int prefixSum[] = new int[n];

        prefixSum[0] = arr[0];
        for(int i = 1; i<n; i++){
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        HashMap <Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int j = 0; j<n; j++){
            if(prefixSum[j] == k)count++;

            int val = prefixSum[j] - k;
            if(map.containsKey(val)){
                count += map.get(val);
            }

            if(!map.containsKey(prefixSum[j])){
                map.put(prefixSum[j], 0);
            }
            map.put(prefixSum[j], map.get(prefixSum[j]) + 1);
        }
        return count;
    }
}