class Solution {
    
    boolean[][] visited ;
    int[][] dp ;
    int m ;
    int n ;
    int mod = 1000000007 ;
    
    public int countPaths(int[][] grid) {
        
        m = grid.length ;
        n = grid[0].length ;
        
        int total_count = 0 ;
        
        visited = new boolean[m][n] ;
        dp = new int[m][n] ;
        
        for(int i = 0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(!visited[i][j]){
                    dfs(i , j , grid , 0);
                }
            }
        }
        
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                total_count =  (total_count)%mod + dp[i][j]%mod ;
            }
        }
        
        return total_count ;
    }
    
    public int dfs(int i , int j , int[][] grid , int prev){
        
        if(i<0 || i>=m || j<0 || j>=n){
            return 0 ;
        }
        
        if(grid[i][j] <= prev){
            return 0 ;
        }
        
        if(dp[i][j] != 0){
            return dp[i][j] ;
        }
        
        visited[i][j] = true ;
        
        int count = (dfs(i+1 , j , grid , grid[i][j]) + dfs(i-1 , j , grid , grid[i][j])
                        + dfs(i , j+1 , grid , grid[i][j]) + dfs(i , j-1 , grid , grid[i][j]))%mod ;
        
        dp[i][j] = count+1 ;
        
        return dp[i][j] ;
    }
}