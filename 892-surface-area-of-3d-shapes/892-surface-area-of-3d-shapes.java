class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int res = n*n*2;
        for(int i = 0; i < n; i++)
        {
            res+=grid[0][i];
            res+=grid[i][0];
            res+=grid[n-1][i];
            res+=grid[i][n-1];
        }
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(grid[i][j] == 0)
                    res -= 2;
                int up = i-1>=0 ? Math.max(0, (grid[i][j]-grid[i-1][j])):0;
                int down = i+1<n ? Math.max(0, (grid[i][j]-grid[i+1][j])):0;
                int left = j-1>=0 ? Math.max(0, (grid[i][j]-grid[i][j-1])):0;
                int right = j+1<n ? Math.max(0, (grid[i][j]-grid[i][j+1])):0;
                res+=(up+down+left+right);
            }
        }
        return res;
    }
}