class Solution {
    public boolean validPalindrome(String str) {
        int lo = 0,  hi = str.length()-1;
        StringBuilder s = new StringBuilder(str);
        int flag = 0;
        int slag = 0;
        while(hi>=lo)
        {
            if(s.charAt(lo) != s.charAt(hi))
            {
                flag++;
                if(s.charAt(lo+1) == s.charAt(hi))
                {
                    lo++;
                }
                else
                {
                    hi--;
                }
            }
            else
            {
                lo++; hi--;
            }
        }
        if(flag>=2)
        {
            lo = 0;  hi = s.length()-1;
            while(hi>=lo)
            {
                if(s.charAt(lo) != s.charAt(hi))
                {
                    slag++;
                    if(s.charAt(lo) == s.charAt(hi-1))
                    {
                        hi--;
                    }
                    else
                    {
                        lo++;
                    }
                }
                else
                {
                    lo++; hi--;
                }
            }
            return slag<2 ? true : false;
        }
        else
        {
            return true;
        } 
        
    }
}