class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();

        if (n <= 1)
            return s;

        int st = 0;
        int max = 1;

        for (int i = 0; i < n; i++) {

            int l = i;
            int r = i;

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > max) {
                    max = r - l + 1;
                    st = l;
                }
                l--;
                r++;
            }

            l = i;
            r = i + 1;

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > max) {
                    max = r - l + 1;
                    st = l;
                }
                l--;
                r++;
            }
        }

        return s.substring(st, st + max);
    }
}