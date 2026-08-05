class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length() == 1)return false;
        for(char i:s.toCharArray()){
            if(i =='{' || i =='(' ||i =='['){
                st.push(i);
                continue;
            }
            else if (st.isEmpty())return false;
            else if(i == '}' && st.peek() == '{'){
                st.pop();                
            }
            else if(i == ')' && st.peek() == '('){
                st.pop();                
            }
            else if(i == ']' && st.peek() == '['){
                st.pop();                
            }
            else{
                return false;
            }

        }
        if(st.isEmpty())return true;
        else return false;
    }
}