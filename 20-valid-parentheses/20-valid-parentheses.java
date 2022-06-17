class Solution {
    public boolean isValid(String s) {
        Stack<Character> ds = new Stack<Character>();
        for(char ch : s.toCharArray())
        {
            if(ch == '}' && !ds.isEmpty() && ds.peek() == '{')
                ds.pop();
            else if(ch == ')' && !ds.isEmpty() && ds.peek() == '(')
                ds.pop();
            else if(ch == ']' && !ds.isEmpty() && ds.peek() == '[')
                ds.pop();
            else ds.push(ch);
        }
        if(ds.isEmpty())
            return true;
        else return false;
    }
}