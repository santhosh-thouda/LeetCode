import java.util.Scanner;

class Solution {
    public String frequencySort(String s) {
        // Step 1: frequency array for all ASCII characters (128 total)
        // freq[ch] = how many times character 'ch' appears in s
        int[] freq = new int[128];

        // Fill frequency array
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // Step 2: create an array of all characters (by their ASCII codes 0–127)
        // Example: chars = [0, 1, 2, 3, ..., 127]
        Integer[] chars = new Integer[128];
        for (int i = 0; i < 128; i++) {
            chars[i] = i; // store character code
        }

        // Step 3: sort chars[] using quicksort, based on freq[]
        quickSort(chars, freq, 0, 127);

        // Step 4: build the result string
        StringBuilder sb = new StringBuilder();

        // Traverse from highest frequency (end) to lowest frequency
        for (int i = 127; i >= 0; i--) {
            int index = chars[i];       // ASCII code of character
            int count = freq[index];    // frequency of that character

            if (count == 0) continue;   // skip characters not in the string

            char ch = (char) index;     // convert ASCII code back to character

            // Append 'ch' to the result, 'count' number of times
            while (count > 0) {
                sb.append(ch);
                count--;
            }
        }

        return sb.toString();
    }

    // QuickSort to sort chars[] based on frequencies in freq[]
    private static void quickSort(Integer[] chars, int[] freq, int low, int high) {
        if (low < high) {
            // find partition position
            int partition = findPartition(chars, freq, low, high);

            // sort left and right parts
            quickSort(chars, freq, low, partition - 1);
            quickSort(chars, freq, partition + 1, high);
        }
    }

    // Partition logic for QuickSort
    private static int findPartition(Integer[] chars, int[] freq, int low, int high) {
        int pivotFreq = freq[chars[high]]; // pivot is the frequency of the last element
        int i = low - 1; // index of smaller element

        // Traverse from low to high - 1
        for (int j = low; j < high; j++) {
            // If current element's frequency is less than pivotFreq
            if (freq[chars[j]] < pivotFreq) {
                i++;

                // Swap chars[i] and chars[j]
                int temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
        }

        // Swap pivot into its correct position
        int temp = chars[i + 1];
        chars[i + 1] = chars[high];
        chars[high] = temp;

        return i + 1; // return partition index
    }
}
