class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];

        for(int i = 0; i<nums.length; i++){
            str[i] = String.valueOf(nums[i]);
        }

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if((str[j] + str[i]).compareTo(str[i] + str[j]) > 0){
                    String temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
        }
        if(str[0].equals("0"))return "0";


        StringBuilder sb = new StringBuilder();

        for(String s : str){
            sb.append(s);
        }

        return sb.toString();
    }
}