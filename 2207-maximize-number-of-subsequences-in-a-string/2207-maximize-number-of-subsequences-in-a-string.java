class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        long p1 = 0;
        long p2 = 0;
        long res = 0;
        char p01 = pattern.charAt(0);
        char p02 = pattern.charAt(1);
        for(char ch : text.toCharArray())
        {
            if(ch == p02)
            {
                res += p1;
                p2++;
            }
            if(ch == p01)
                p1++;
        }
        return res + Math.max(p1, p2);
    }
}