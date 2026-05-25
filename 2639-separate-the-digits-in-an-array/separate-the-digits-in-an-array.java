class Solution {
    public int[] separateDigits(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){
            Stack<Integer> stk = new Stack<>();

            while(arr[i] > 0){
                int ld = arr[i] % 10;
                stk.push(ld);
                arr[i] = arr[i]/10;
            }
            
            while(!stk.isEmpty()){
                list.add(stk.pop());
            }
        }

        int newArr[] = new int[list.size()];

        for(int i = 0; i<newArr.length; i++){
            newArr[i] = list.get(i);
        }

        return newArr;
    }
}