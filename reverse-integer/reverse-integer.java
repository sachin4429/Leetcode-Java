class Solution {
    public int reverse(int x) {
        long rev=0;
        if(x>0)
        {
            while(x>0)
            {
                int d=x%10;
                    rev=rev*10+d;
                    x/=10;
            }
        }
        else
        {
            x = Math.abs(x);
            while(x>0)
            {
                int d=x%10;
                    rev=rev*10+d;
                    x/=10;
            }
            rev=rev*-1;
            
        }
        if (Math.pow(-2, 31)<=rev && rev<=Math.pow(2, 31)-1)
        return (int)rev;
        else
            return 0;
    }
}