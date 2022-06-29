class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;
        int n = grid.length, m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int total = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(grid[i][j] == 2)
                    q.add(new int[]{i,j});
                if(grid[i][j] != 0)
                    total++;
            }
        }
        
        if(total == 0)
            return 0;
        int minutes = 0, count = 0;
        int dx[] = {0, 0, -1, 1};
        int dy[] = {-1, 1, 0, 0};
        
        while(!q.isEmpty())
        {
            int size = q.size();
            count+= size;
            for(int j = 0; j<size; j++)
            {
                int itr[] = q.poll();
                for(int i = 0; i<4; i++)
                {
                    int x = itr[0] + dx[i];
                    int y = itr[1] + dy[i];
                    if(x < 0 || y < 0 || x >= n || y >= m || grid[x][y] != 1) 
                        continue;
                    grid[x][y] = 2;
                    q.add(new int[]{x,y});
                }
            }
                
            if(q.size() != 0)
                minutes++;
        }
        
        return count == total ? minutes : -1;
    }
}