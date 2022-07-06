class Solution {
	public int[][] matrixBlockSum(int[][] mat, int k) {
		int R = mat.length;
		int C = mat[0].length;

		int[][] horiPrefix = new int[R][C];


		for(int i=0; i<R; i++) {
			horiPrefix[i][0] = mat[i][0];    
		}

		for(int i=0; i<R; i++) {
			for(int j=1; j<C; j++) {
				horiPrefix[i][j] = horiPrefix[i][j-1] + mat[i][j];
			}
		}

		int[][] ansGrid = new int[R][C];

		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				for(int a=(i-k < 0 ? 0 : i-k); a<=i+k && a<R; a++) {

					ansGrid[i][j] += (j+k >= C ? horiPrefix[a][C-1] : horiPrefix[a][j+k]);
					ansGrid[i][j] -= (j-k-1 < 0 ? 0 : horiPrefix[a][j-k-1]);
				}
			}
		}

		return ansGrid;
	}
}