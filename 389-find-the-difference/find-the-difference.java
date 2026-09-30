class Solution {
    public char findTheDifference(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters in t
        for(char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Remove characters from s
        for(char ch : s.toCharArray()) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
            }
        }

        // Find remaining character
        for(char ch : map.keySet()) {
            if(map.get(ch) == 1) {
                return ch;
            }
        }

        return ' ';
    }
}