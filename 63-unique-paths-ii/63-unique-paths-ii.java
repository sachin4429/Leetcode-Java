class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1] == 1)
            return 0;
        int dp[][] = new int[m+1][n+1];
        for(int i[] : dp)
            Arrays.fill(i,-1);
        return countpath(0,0,m,n,dp,obstacleGrid);
    }
    int countpath(int i, int j, int m, int n, int[][] dp, int[][] obstacleGrid)
    {
        if(i == m-1 && j == n-1)
            return 1;
        if(i>=m || j>=n)
            return 0;
        if(obstacleGrid[i][j] == 1)
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];
        else
            return dp[i][j] = countpath(i+1,j,m,n,dp,obstacleGrid) + countpath(i,j+1,m,n,dp,obstacleGrid);
    }
}