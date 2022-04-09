class Solution {
    public int minInsertions(String s) {
        StringBuilder sb=new StringBuilder(s);
        StringBuilder rb=new StringBuilder(s);
        rb.reverse(); 
        int n = s.length();
        int t[][] = new int[n+1][n+1];
        for(int i = 1; i<n+1; i++)
        {
            for(int j = 1; j<n+1; j++)
            {
                if(sb.charAt(i-1) == rb.charAt(j-1))
                {
                    //System.out.println(i +" "+ j);
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else
                {
                    t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        int res =  t[n][n];
        if(res == n)
            return 0;
        else 
            return n - res;
    }
}