class Solution {
    public String[] divideString(String s, int k, char fill) {
         int n = s.length();
        String ans[];

        if (n % k == 0)
            ans = new String[n / k];
        else
            ans = new String[(n / k) + 1];

        int z = 0;
        int j = k;

        for (int i = 0; i < n; i = i + k) {
            if (i + k <= n) {
                ans[z++] = s.substring(i, j);
                j = j + k;
            } else {
                ans[z] = s.substring(i, n);
                int rem = k - (n - i);
                while (rem-- > 0)
                    ans[z] += fill;
            }
        }

        return ans;
    }
}