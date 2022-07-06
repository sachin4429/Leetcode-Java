class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length()%2 != 0)
            return false;
        if(s.charAt(0) == ')' && locked.charAt(0) == '1')
            return false;
        int n = s.length();
        if(s.charAt(n-1) == '(' && locked.charAt(n-1) == '1')
            return false;
        int open  = 0, close = 0, unlocked = 0;
        for(int i = 0; i<n; i++)
        {
            if(locked.charAt(i) == '1' && s.charAt(i) == '(')
                open++;
            else if(locked.charAt(i) == '1' && s.charAt(i) == ')')
                close++;
            else if(locked.charAt(i) == '0')
                unlocked++;
            if(open+unlocked<close)
                return false;
        }
        open  = 0; close = 0; unlocked = 0;
        for(int i = n-1; i>=0; i--)
        {
            if(locked.charAt(i) == '1' && s.charAt(i) == '(')
                open++;
            else if(locked.charAt(i) == '1' && s.charAt(i) == ')')
                close++;
            else if(locked.charAt(i) == '0')
                unlocked++;
            if(close+unlocked<open)
                return false;
        }
        
            return true;
    }
}