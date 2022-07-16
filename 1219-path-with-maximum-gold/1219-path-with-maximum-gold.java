class Solution {
    int r = 0, c = 0, max = 0;
    int [][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    public int getMaximumGold(int[][] grid) {
        r = grid.length;
        c = grid[0].length;
        for(int i = 0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
            {
                max = Math.max(max, dfs(grid, i, j, 0));
            }
        }
        return max;
    }
    public int dfs(int[][] grid, int i, int j, int gold)
    {
        if(i<0 || i >= r || j<0 || j>=c || grid[i][j] == 0)
        {
            return gold;
        }
        int val = grid[i][j];
        gold += val;
        grid[i][j] = 0;
        int maxPathGold = gold;
        for(int[] offset: dir)
            maxPathGold = Math.max(maxPathGold, dfs(grid, offset[0] + i, offset[1] + j, gold));
        grid[i][j] = val;
        return maxPathGold;
    }
}