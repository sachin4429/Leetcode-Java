class Solution {
    boolean uc = false, lc = false, digit = false, sc = false;
    public boolean strongPasswordCheckerII(String pwd) {
        if(pwd.length() < 8)
            return false;
        check(pwd.charAt(0));
        char prev = pwd.charAt(0);
        for(int i =1; i<pwd.length(); i++)
        {
            check(pwd.charAt(i));
            if(prev == pwd.charAt(i))
                return false;
            prev = pwd.charAt(i);
        }
        return uc && lc && digit && sc;
    }
    public void check(char ch)
    {
        if(Character.isDigit(ch))
            digit = true;
        else if(Character.isUpperCase(ch))
            uc = true;
        else if(Character.isLowerCase(ch))
            lc = true;
        else 
            sc = true;
        
    }
}