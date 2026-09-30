class Solution {

    public String reverseVowels(String s) {

        int left = 0;
        int right = s.length() - 1;

        StringBuilder sb = new StringBuilder(s);

        while (left < right) {

            // Move left until vowel
            while (left < right && !isVowel(sb.charAt(left))) {
                left++;
            }

            // Move right until vowel
            while (left < right && !isVowel(sb.charAt(right))) {
                right--;
            }

            // Swap vowels
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }

        return sb.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' ||
               c == 'O' || c == 'U';
    }
}