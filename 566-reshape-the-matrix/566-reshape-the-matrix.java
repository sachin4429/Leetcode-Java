class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length != r*c)
            return mat;
        if(mat.length == r && mat[0].length == c)
            return mat;
        int res[][] = new int[r][c];
        int a = 0, b = 0;
        for(int i = 0; i<r; i++)
        {
            for(int j =0; j<c; j++)
            {
                res[i][j] = mat[a][b];
                if(mat[0].length-1 == b)
                {
                    a++;
                    b = -1;
                }
                b++;
            }
        }
        return res;
    }
}