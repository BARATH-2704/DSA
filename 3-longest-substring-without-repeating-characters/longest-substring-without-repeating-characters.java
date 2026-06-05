class Solution {
    public int lengthOfLongestSubstring(String s) {
        char arr[] = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int start =0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);

            max = Math.max(max,i-start+1);
        }

        return max;
    }
}