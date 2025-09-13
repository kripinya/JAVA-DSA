class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26]; // store frequency of a-z

        // Step 1: Count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;  // 'a' -> 0, 'b' -> 1, ... 'z' -> 25
        }

        // Step 2: Find max vowel and consonant
        int maxV = 0, maxC = 0;
        for (int i = 0; i < 26; i++) {
            int f = freq[i];
            if (f > 0) {
                char ch = (char)(i + 'a');
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    maxV = Math.max(maxV, f);
                } else {
                    maxC = Math.max(maxC, f);
                }
            }
        }

        // Step 3: return sum
        return maxV + maxC;
    }
}
