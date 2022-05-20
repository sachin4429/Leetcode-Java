class Solution {
    int count = 0;
    public int uniquePathsIII(int[][] grid) {
        
        // count the number of valid cells
        int validCells = 1;
        
        // starting row index in the array
        int startR = 0;
        
        // starting column index in the array
        int startC = 0;
        
        for(int r=0; r<grid.length; r++)
        {
            for(int c=0; c<grid[r].length; c++)
            {
                // find the starting cell
                if(grid[r][c] == 1)
                {
                    startR = r;
                    startC = c;
                }
                
                // count each valid cell
                if(grid[r][c] == 0)
                {
                    validCells++;
                }
            }
        }
       
        dfs(grid, startR, startC, validCells);
        
        /*
            ideas:
                -> count the number of valid cells we can step over.
                -> When examining the board:
                    -> For each 0 we find, decrememnt the number of valid cells and replace with -1 so we don't go over that cell again
                    -> if validCells == 0 and we can move to a '2' from the current cell, we have a valid path
                    -> if we get to a point where we cannot make a valid move then we backtrack until we can make another valid move
        */
        
        return count;
    }
    
    private void dfs(int[][] grid, int r, int c, int validCellsRemaining)
    {
        // check whether r/c in bounds
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[r].length || grid[r][c] == -1 || validCellsRemaining < 0)
        {
            return;
        }
        
        // if we find the ending position and still have cells left to find, then we return
        if(grid[r][c] == 2 && validCellsRemaining != 0)    
        {
            return;
        }
        
        if(grid[r][c] == 2 && validCellsRemaining == 0)
        {
            count++;
            return;
        }

        // set the current cell to -1 so we don't recurse back onto cell (can cause never ending loop)
        grid[r][c] = -1;
        
        // check 4 directions
        dfs(grid, r-1, c, validCellsRemaining-1);
        dfs(grid, r+1, c, validCellsRemaining-1);
        dfs(grid, r, c-1, validCellsRemaining-1);
        dfs(grid, r, c+1, validCellsRemaining-1);
        
        // reinstate the board 
        grid[r][c] = 0;
    }
}