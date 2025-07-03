class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        
        while (sb.length() < k) {
            int len = sb.length();
            for (int i = 0; i < len && sb.length() < k; i++) {
                char nextChar = (char) ((sb.charAt(i) - 'a' + 1) % 26 + 'a');
                sb.append(nextChar);
            }
        }
        
        return sb.charAt(k - 1); 
    }
}
