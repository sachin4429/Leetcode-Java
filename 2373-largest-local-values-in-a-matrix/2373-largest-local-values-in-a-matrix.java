class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] mat = new int[n-2][n-2];
        for(int i = 0; i<=n-3; i++)
        {
            for(int j = 0; j<=n-3; j++)
            {
                int max = 0;
                for(int k = i; k<i+3; k++)
                {
                    for(int l = j; l<j+3; l++)
                    {
                        //System.out.println(grid[k][l]);
                        max = Math.max(max, grid[k][l]);
                    }
                }
                mat[i][j] = max;
            }
        }
        return mat;
    }
}