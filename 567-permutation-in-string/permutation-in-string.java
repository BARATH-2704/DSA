class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(freq1, freq2)) {
            return true;
        }

        // Slide window
        for (int i = s1.length(); i < s2.length(); i++) {

            // Add incoming character
            freq2[s2.charAt(i) - 'a']++;

            // Remove outgoing character
            freq2[s2.charAt(i - s1.length()) - 'a']--;

            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }
}