class Solution {
    public int maxAreaOfIsland(int[][] grid) {
      int m=grid.length,n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !visited[i][j])
                    count=Math.max(count,getArea(m,i,n,j,visited,grid)); 
            }
        }
        
        return count;
    }
    
    public int getArea(int m,int i,int n,int j,boolean[][] visited,int[][] grid){
       if(i<0 || i>=m || j<0 || j>=n || visited[i][j] || grid[i][j]!=1)
           return 0;
        
        visited[i][j]=true;
        return 1+getArea(m,i+1,n,j,visited,grid)+
                 getArea(m,i,n,j+1,visited,grid)+
                 getArea(m,i-1,n,j,visited,grid)+
                 getArea(m,i,n,j-1,visited,grid);
    }
}