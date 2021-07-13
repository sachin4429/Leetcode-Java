class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0)
        {   int n = x;
            int rev = 0;
            while(x!=0)
            {
                int d=x%10;
                rev=rev*10+d;
                x/=10;
            }
            while(rev!=0)
            {
                if(n%10==rev%10)
                {
                    n/=10;
                    rev/=10;
                }
                else
                    return false;
            }
                 if(rev==0)
                    {
                        return true;
                    }
                else
                    return false;
        }
        else
            return false;
    }
}
        