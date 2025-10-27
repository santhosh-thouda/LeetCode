class Solution {
    public int numberOfBeams(String[] bank) {
        int totalBeams = 0;
        int prevBeams = 0;

        for(String row : bank){
            int currentCount = 0;
            for(char ch : row.toCharArray()) {
                if(ch == '1')currentCount++;
            }
            if(currentCount > 0){
                totalBeams += prevBeams * currentCount;
                prevBeams = currentCount;
            }
        }
        return totalBeams;
    }
}