class Solution {
    public int countSubstrings(String s) {
        int n = s.length(), ans = 0;
        if(n<=1)
            return n;
        for(int i = 0; i<n ; i++)
        {
            ans += checkPalindrome(s,i,i,n);
            ans += checkPalindrome(s,i,i+1,n);
        }
        return ans;
    }
    public int checkPalindrome(String s, int l, int r, int n)
    {
        int res = 0;
        while(l>=0 && r<=n-1 && s.charAt(l--) == s.charAt(r++))
            res++;
        return res;
    }
}