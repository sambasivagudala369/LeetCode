import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>(); // Fixed list initialization

        if (words == null || words.length == 0) {
            return res; // Handle edge cases
        }

        int[] minFreq = new int[26]; // Stores minimum frequency of each character
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for (String word : words) {
            int[] charCount = new int[26]; // Frequency array for each word
            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charCount[i]); // Find common minimum frequency
            }
        }

        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                res.add(String.valueOf((char) (i + 'a')));
                minFreq[i]--;
            }
        }

        return res;
    }
}
