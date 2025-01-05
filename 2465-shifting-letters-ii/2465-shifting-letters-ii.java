class Solution {
     public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] delta = new int[n + 1]; // Extra space to handle end boundary

        // Step 1: Populate the delta array
        for (int[] shift : shifts) {
            int start = shift[0], end = shift[1], direction = shift[2];
            if (direction == 1) {
                delta[start] += 1; // Forward shift
                delta[end + 1] -= 1; // Stop after the range
            } else {
                delta[start] -= 1; // Backward shift
                delta[end + 1] += 1; // Stop after the range
            }
        }

        // Step 2: Compute the prefix sum for cumulative shifts
        int[] prefixSum = new int[n];
        int cumulativeShift = 0;
        for (int i = 0; i < n; i++) {
            cumulativeShift += delta[i];
            prefixSum[i] = cumulativeShift;
        }

        // Step 3: Apply shifts to the string
        char[] result = s.toCharArray();
        for (int i = 0; i < n; i++) {
            int shift = prefixSum[i] % 26; // Reduce shifts within a single cycle
            if (shift < 0) shift += 26; // Handle negative shifts
            result[i] = (char) (((result[i] - 'a' + shift) % 26) + 'a');
        }

        return new String(result);
     }
}
