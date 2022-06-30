class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        long[][] t = new long[n][m];
        for(int i =0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                t[i][j] = -1;
            }
        }
        return (int)solve(n-1, m-1, grid, t);
    }
    public long solve(int i, int j, int[][] grid, long[][] t)
    {
        if(i == 0 && j == 0)
            return t[i][j] = grid[0][0];
        if(i<0 || j<0)
            return Integer.MAX_VALUE;
        if(t[i][j] != -1)
            return t[i][j];
        return t[i][j] = Math.min(grid[i][j] + solve(i-1, j , grid, t), grid[i][j] + solve(i, j-1 , grid, t));
    }
}