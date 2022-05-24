class Solution {
    public int longestValidParentheses(String s) {
        int open  = 0, close = 0, max = 0;
        char[] ch = s.toCharArray();
        for(char c : ch)
        {
            if(c == '(')
                open++;
            else
                close++;
            
            if(open == close)
            {
                int len = 2*open;
                max = Math.max(len,max);
            }
            else if(close>open)
                open = close = 0;
        }
        
        open = close = 0;
        for(int i = ch.length-1; i>=0; i--)
        {
            char c = ch[i];
            if(c == '(')
                open++;
            else
                close++;
            
            if(open == close)
            {
                int len = 2*open;
                max = Math.max(len,max);
            }
            else if(open>close)
                open = close = 0;
        }
        return max;
    }
}