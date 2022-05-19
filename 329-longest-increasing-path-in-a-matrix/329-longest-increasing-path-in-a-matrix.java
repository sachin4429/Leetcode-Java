class Solution {
  int Y, X;
  
  public int DFS(int[][] mat, int[][] visited, int y, int x){
    if(visited[y][x] != 0) return visited[y][x];
    
    int val = 0; 
      
    if(y != 0 && mat[y][x] < mat[y-1][x]) val = Math.max(val, DFS(mat, visited, y-1, x) );
    if(y != Y && mat[y][x] < mat[y+1][x]) val = Math.max(val, DFS(mat, visited, y+1, x) );
    if(x != 0 && mat[y][x] < mat[y][x-1]) val = Math.max(val, DFS(mat, visited, y, x-1) );
    if(x != X && mat[y][x] < mat[y][x+1]) val = Math.max(val, DFS(mat, visited, y, x+1) );
    
    return visited[y][x] = val + 1; 
  }
  
  public int longestIncreasingPath(int[][] matrix) {
    int answer = 1;
    Y = matrix.length - 1;
    X = matrix[0].length - 1;
    int[][] visited = new int[Y+1][X+1];
    
    for(int i = 0; i != Y+1; i++)
      for(int j = 0; j != X+1; j++)
        if(visited[i][j] == 0) answer = Math.max(answer, DFS(matrix, visited, i, j));
    
    return answer;
  }
}