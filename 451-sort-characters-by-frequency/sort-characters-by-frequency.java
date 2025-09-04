import java.util.Scanner;

class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }

        Integer[] chars = new Integer[128];
        for(int i = 0; i<128; i++){
            chars[i] = i;
        }

        quickSort(chars, freq, 0, 127);

        StringBuilder sb = new StringBuilder();
        for(int i = 127; i>=0; i--){
            int index = chars[i];
            int count = freq[index];
            if(count == 0)break;
            char ch = (char)(index);
            while(count > 0){
                sb.append(ch);
                count--;
            }
        }
        return sb.toString();
    }

    private static void quickSort(Integer chars[], int freq[], int low, int high){
        if(low < high){
            int partition = findPartition(chars, freq, low, high);
            quickSort(chars, freq, low, partition - 1);
            quickSort(chars, freq, partition + 1, high);
        }
    }

    private static int findPartition(Integer []chars, int[] freq, int low, int high){
        int pivotFreq = freq[chars[high]];
        int i = low - 1;

        for(int j = low; j<high; j++){
            if(freq[chars[j]] <= pivotFreq){
                i++;
                int temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
        } 
        int temp = chars[i+1];
        chars[i+1] = chars[high];
        chars[high] = temp;
        return i+1;
    }
}