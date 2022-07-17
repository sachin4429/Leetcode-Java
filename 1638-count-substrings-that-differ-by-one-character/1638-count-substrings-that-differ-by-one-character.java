class Solution {
    public int countSubstrings(String s, String t) {
        int n = s.length(); int m = t.length();
        int[][] same = new int[n+1][m+1];
        int[][] diff = new int[n+1][m+1];
        int ans = 0;
        for(int i = 1; i<n+1; i++)
        {
            for(int j = 1; j<m+1; j++)
            {
                if(s.charAt(i-1) == t.charAt(j-1))
                {
                    same[i][j] = 1+same[i-1][j-1];
                    diff[i][j] = diff[i-1][j-1];
                }
                else
                {
                    same[i][j] = 0;
                    diff[i][j] = 1+same[i-1][j-1];
                }
                ans += diff[i][j];
            }
        }
        return ans;
    }
    
}