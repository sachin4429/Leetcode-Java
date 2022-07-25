class Solution {
    public int calculate(String s) {
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        int cn = 0;
        char op = '+';
        for(int i=0; i<n; i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
                cn = cn*10 + ch-'0';
            if(!Character.isDigit(ch) && !Character.isWhitespace(ch) || i == n-1)
            {
                if(op == '-')
                    stack.push(-cn);
                else if(op =='+')
                    stack.push(cn);
                else if(op =='*')
                    stack.push(stack.pop()*cn);
                else if(op =='/')
                    stack.push(stack.pop()/cn);
                op = ch;
                cn = 0;
            }
            
        }
        
        int res = 0;
        while (!stack.isEmpty())
            res += stack.pop();
        
        return res;
        
    }
}