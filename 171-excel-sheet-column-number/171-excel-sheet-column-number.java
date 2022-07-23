class Solution {
    public int titleToNumber(String s) {
        int p = 0, res = 0;
        for(int i = s.length()-1; i>=0; i--)
        {
            res += (s.charAt(i)-64) * Math.pow(26,p++);
        }
        return res;
    }
}