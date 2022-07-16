class Solution {
    long[][][] vis;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        vis = new long[m+1][n+1][maxMove+1];
        for(long [][]invis : vis)
            for(long[] t : invis)
                Arrays.fill(t,-1);
        return (int)findMoves(m, n, maxMove,  startRow,  startColumn);
        
    }
    
    public long findMoves(int m,int n,int maxMove,int startRow,int startColumn){
        if(maxMove<0)
            return 0;
        
        if(startRow==m || startColumn==n || startRow<0 || startColumn<0)
            return 1;
        
        if(vis[startRow][startColumn][maxMove]!=-1)
            return vis[startRow][startColumn][maxMove];
        
        long total=0;
        total=(findMoves(m,n,maxMove-1,startRow-1,startColumn)+
              findMoves(m,n,maxMove-1,startRow+1,startColumn)+
              findMoves(m,n,maxMove-1,startRow,startColumn+1)+
              findMoves(m,n,maxMove-1,startRow,startColumn-1))%1000000007;
        
        return vis[startRow][startColumn][maxMove] = total;
    } 
}