class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String res = "";
        for(int i =s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }

        if(res.equals(s)) return true;
        return false;
    }
}