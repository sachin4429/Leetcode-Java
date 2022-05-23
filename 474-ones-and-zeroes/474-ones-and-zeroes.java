class Solution {
    int[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) 
    {
        dp = new int[m + 1][n + 1][strs.length];
        return helper(strs,m,n,0);   
    }
    public int helper(String[] strs, int m, int n, int index)
    {
        if(index == strs.length || m+n == 0)
            return 0;
        if(dp[m][n][index] > 0)
            return dp[m][n][index];
        int[] count = count01(strs[index].toCharArray());
        if(m>=count[0] && n>=count[1])
        {
            return dp[m][n][index] = Math.max(1+helper(strs,m-count[0],n-count[1],index+1),helper(strs,m,n,index+1));
        }
        else
        {
            return dp[m][n][index] = helper(strs,m,n,index+1);
        }
    }
    public int[] count01(char[] c)
    {
        int count[] = new int[2];
        for(char ch : c)
        {
            if(ch == '0')
                count[0]++;
            else
                count[1]++;
        }
        return count;
    }
}