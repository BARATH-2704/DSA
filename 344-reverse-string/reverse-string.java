class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int l =0;
        for(int r = n-1;r>l;r--){
            char temp = ' ';

            temp = s[r];
            s[r] = s[l];
            s[l] = temp;
            l++;
        }
    }
}