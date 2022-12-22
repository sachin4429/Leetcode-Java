class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] diff = new int[m][n];
        int[] row0 = new int[m];
        int[] row1 = new int[m];
        for(int i = 0; i<m; i++)
        {
            int z = 0, o = 0;
            for(int j = 0; j<n; j++)
            {
                if(grid[i][j] == 0)
                    z++;
                else if(grid[i][j] == 1)
                    o++;
            }
            row0[i] = z;
            row1[i] = o;
        }
        int[] col0 = new int[n];
        int[] col1 = new int[n];
        for(int i = 0; i<n; i++)
        {
            int z = 0, o = 0;
            for(int j = 0; j<m; j++)
            {
                if(grid[j][i] == 0)
                    z++;
                else if(grid[j][i] == 1)
                    o++;
            }
            col0[i] = z;
            col1[i] = o;
        }
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                diff[i][j] = row1[i] + col1[j] - row0[i] - col0[j];
            }
        }
        return diff;
    }
}