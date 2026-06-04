class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int slow=0;
        for(int fast=s.length()-1;fast>=0;fast--){
            if(s.charAt(slow)==s.charAt(fast)){
                slow++;
            }
            else{
                return false;
            }
        }
        if(slow==s.length()){
            return true;
        }
        else return false;
    }
}