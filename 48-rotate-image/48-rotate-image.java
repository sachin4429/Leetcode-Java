class Solution {
       public void rotate(int[][] matrix) {
 
        int m = matrix.length;
        int arr[] = new int[m*m];
        int k = 0;
 
      for(int i = 0; i<m; i++)
      {
          for(int j = m-1; j>=0; j--)
          {
              arr[k] = matrix[j][i];
              k++;
          }
      }
      k = 0;
      for(int i = 0; i<m; i++)
      {
          for(int j = 0; j<m; j++)
          {
              matrix[i][j] = arr[k];
              k++;
          }
      }
    }
}