class Solution {
    public int titleToNumber(String s) {
        int res=0;
        int p=0;
        for(int i=(s.length()-1) ; i>=0 ; i--)
        {
            res+=((int)(s.charAt(i))-64)*(Math.pow(26,p));
            p+=1;
        }
        return res;
    }
}