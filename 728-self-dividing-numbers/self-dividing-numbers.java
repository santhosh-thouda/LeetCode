class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for(int i = left; i <= right; i++){
            if(isSelfDividing(i)){
                list.add(i);
            }
        }
        return list;
    }

    public boolean isSelfDividing(int num){
        int temp = num;

        while(num > 0){
            int ld = num % 10;
            if(ld == 0 || (temp % ld) != 0) return false;
            num = num / 10;
        }

        return true;
    }
}