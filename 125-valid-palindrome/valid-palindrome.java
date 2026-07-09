class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int slow =0;
        for(int fast =s.length()-1;fast>=slow;fast--){
            char chf = s.charAt(fast);
            char chs = s.charAt(slow);
            if(chs!=chf){
                return false;
            }
            slow++;
        }
        return true;
    }
}